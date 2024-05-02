package com.microservices.http.response;

import com.microservices.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor@NoArgsConstructor
public class StudentByCourseResponse { //Respuesta personalizada
    private String courseName;
    private String teacher;
    private List<StudentDTO> studentList;
}
