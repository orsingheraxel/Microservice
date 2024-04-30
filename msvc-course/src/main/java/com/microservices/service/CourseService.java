package com.microservices.service;

import com.microservices.entities.Course;
import com.microservices.persistence.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    ICourseRepository courseRepository;

    public Course findById(Long id){
        return courseRepository.findById(id).orElseThrow();
    }

    public List<Course> findAll(){
        return courseRepository.findAll();
    }

    public void deleteById(Long id){
        courseRepository.deleteById(id);
    }

    public void save(Course course){
        courseRepository.save(course);
    }
}
