package com.loiane.crudspring.repository;

import com.loiane.crudspring.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository <Curso, Long> {
}
