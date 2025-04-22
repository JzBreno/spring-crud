package com.jzbreno.repository;

import com.jzbreno.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //podemos utilizar interfaces para acessos a banco de dados com jpa
public interface CourseRepository extends JpaRepository<Course, Long> {

}
