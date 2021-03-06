package PruebaCrudRepository;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edu.ucentral.app.model.Clasificacion;
import co.edu.ucentral.app.repository.ClasificacionRepository;

public class AppCreate {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		ClasificacionRepository repo = context.getBean("clasificacionRepository", ClasificacionRepository.class);
		Clasificacion clasificacion = new Clasificacion();
		clasificacion.setNombre("Clasificacion C");
		repo.save(clasificacion);
		
		context.close();

	}

}
