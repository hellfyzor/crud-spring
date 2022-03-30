package com.marcio.crudspring;

import com.marcio.crudspring.model.Courses;
import com.marcio.crudspring.repository.CoursesRepository;
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
    CommandLineRunner initDataBase(CoursesRepository coursesRepository){
        return args -> {
            coursesRepository.deleteAll();

            Courses c = new Courses();
            Courses c2 = new Courses();
            Courses c3 = new Courses();
            Courses c4 = new Courses();

            c.setName("Angular");
            c.setCategory("Front-End");

            c2.setName("Spring");
            c2.setCategory("Back-End");

            c3.setName("Angular + Spring");
            c3.setCategory("FullStack");

            c4.setName("Banco de Dados");
            c4.setCategory("Banco de Dados");

            coursesRepository.save(c);
            coursesRepository.save(c2);
            coursesRepository.save(c3);
            coursesRepository.save(c4);

        };
    }

}
