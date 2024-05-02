package com.microservices.persistence;

import com.microservices.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IStudentRepository extends JpaRepository<Student,Long> {
    List<Student> findAllByIdCourse(Long id);
}
