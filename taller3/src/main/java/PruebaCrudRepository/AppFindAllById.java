package PruebaCrudRepository;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edu.ucentral.app.model.Clasificacion;
import co.edu.ucentral.app.repository.ClasificacionRepository;

public class AppFindAllById {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		ClasificacionRepository repo = context.getBean("clasificacionRepository", ClasificacionRepository.class);
		List<Integer> ids = new LinkedList<Integer>();
		ids.add(1);
		ids.add(2);
		Iterable<Clasificacion> it = repo.findAllById(ids);
		for(Clasificacion c: it) {
			System.out.println(c.getNombre());
		}
		context.close();
	}

}
