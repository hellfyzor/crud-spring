package com.loiane.crudspring.controller;

import com.loiane.crudspring.model.Curso;
import com.loiane.crudspring.repository.CursoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
@AllArgsConstructor
public class CursoController {


    private CursoRepository cursoRepository;

    @GetMapping
    public List<Curso> list () {
        return cursoRepository.findAll();
    }

}
