package com.marcio.crudspring.controller;

import com.marcio.crudspring.model.Courses;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.marcio.crudspring.repository.CoursesRepository;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/courses")
public class CoursesController {

    private CoursesRepository coursesRepository;

    @GetMapping
    public List<Courses> listar(){
        return coursesRepository.findAll();
    }


}
