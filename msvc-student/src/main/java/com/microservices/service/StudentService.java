package com.microservices.service;

import com.microservices.entities.Student;
import com.microservices.persistence.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepository studentRepository;

    public Student findById(Long id){
        return studentRepository.findById(id).orElseThrow();
    }

    public List<Student> findAlL(){
        return studentRepository.findAll();
    }

    public void save (Student student){
        studentRepository.save(student);
    }

    public List<Student> findAllByIdCourse(Long id){
        return studentRepository.findAllByIdCourse(id);
    }

    public void deleteById(Long id){
        studentRepository.deleteById(id);
    }

}
