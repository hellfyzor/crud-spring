package com.loiane.crudspring.controller;

import com.loiane.crudspring.model.Curso;
import com.loiane.crudspring.repository.CursoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Curso create(@RequestBody Curso curso){

        return cursoRepository.save(curso);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> findById(@PathVariable Long id ){

        return cursoRepository.findById(id)
                .map(recordFound -> ResponseEntity.ok().body(recordFound))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> update (@PathVariable Long id, @RequestBody Curso curso){
        return cursoRepository.findById(id)
                .map(recordFound -> {
                    recordFound.setNome(curso.getNome());
                    recordFound.setCategoria(curso.getCategoria());
                    Curso updated = cursoRepository.save(recordFound);
                    return ResponseEntity.ok().body(updated);
                } )
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id){
        return cursoRepository.findById(id)
                .map(recordFound -> {
                    cursoRepository.deleteById(id);
                    return ResponseEntity.noContent().<Void>build();
                } )
                .orElse(ResponseEntity.notFound().build());
    }

}
