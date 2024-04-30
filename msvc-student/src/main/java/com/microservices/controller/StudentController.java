package com.microservices.controller;

import com.microservices.entities.Student;
import com.microservices.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById (@PathVariable Long id){
        return ResponseEntity.ok(studentService.findById(id));
    }

    @GetMapping("/searchAll")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(studentService.findAlL());
    }

    @PostMapping("/create")
    public void save (@RequestBody Student student){
        studentService.save(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        studentService.deleteById(id);
    }

    @GetMapping("/search-by-course/{id}")
    public ResponseEntity<?> findByIdCourse(@PathVariable Long id){
        return ResponseEntity.ok(studentService.findAllByIdCourse(id));
    }
}
