package com.microservices.client;

import com.microservices.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="msvc-student", url = "localhost:8090/api/student")
public interface StudentClient {

    @GetMapping("/search-by-course/{id}")
    List<StudentDTO> findByIdCourse(@PathVariable Long id);
}
