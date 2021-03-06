package co.edu.ucentral.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import co.edu.ucentral.app.model.Video;
import co.edu.ucentral.app.service.IVideoService;

@Controller
public class ControllerHome {

	@Autowired
	private IVideoService videoService;

	@RequestMapping(value = "/inicio", method = RequestMethod.GET)
	public String goinicio() {
		return "inicio";
	}

	@RequestMapping(value = "/consultar", method = RequestMethod.GET)
	public String mostrarDetalle(Model model, @RequestParam("id") int id, @RequestParam("titulo") String titulo) {
		Video video = videoService.searchById(id);
		System.out.println("video encontrado: " + video);
		model.addAttribute("video", video);

		return "mostrarVideo";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String paginaPrincipal(Model model) {
		List<Video> lista = videoService.selectAll();
		model.addAttribute("lista", lista);
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getPath());
		}
		return "inicio";
	}

}
