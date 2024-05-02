package com.microservices.controller;

import com.microservices.entities.Course;
import com.microservices.http.response.StudentByCourseResponse;
import com.microservices.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(courseService.findById(id));
    }

    @GetMapping("/searchAll")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(courseService.findAll());
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById (@PathVariable Long id){
        courseService.deleteById(id);
    }

    @PostMapping("/create")
    public void save(Course course){
        courseService.save(course);
    }

    @GetMapping("/search-by-id/{idCourse}")
    public ResponseEntity<?> findByIdCourse(@PathVariable Long idCourse){
        return ResponseEntity.ok(courseService.findByIdCourse(idCourse));
    }
}
