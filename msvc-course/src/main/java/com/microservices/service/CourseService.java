package com.microservices.service;

import com.microservices.client.StudentClient;
import com.microservices.dto.StudentDTO;
import com.microservices.entities.Course;
import com.microservices.http.response.StudentByCourseResponse;
import com.microservices.persistence.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    ICourseRepository courseRepository;
    @Autowired
    StudentClient studentClient;

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

    public StudentByCourseResponse findByIdCourse (Long id){ //Respuesta personalizada
        //Buscamos curso
        Course course = courseRepository.findById(id).orElse(new Course());

        //Buscamos esudiantes
        List<StudentDTO> students = studentClient.findByIdCourse(id);

        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentList(students)
                .build();
    }
}
