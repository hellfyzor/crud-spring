package com.loiane.crudspring;

import com.loiane.crudspring.model.Curso;
import com.loiane.crudspring.repository.CursoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}
	@Bean
	CommandLineRunner initDatabase (CursoRepository cursoRepository){
		return args -> {
			cursoRepository.deleteAll();

			Curso c = new Curso();
			c.setNome("Angular com Spring");
			c.setCategoria("Full Steck");

			cursoRepository.save(c);

		};
	}

}
