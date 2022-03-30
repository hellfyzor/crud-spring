package com.marcio.crudspring.repository;

import com.marcio.crudspring.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository <Courses, Long> {
}
