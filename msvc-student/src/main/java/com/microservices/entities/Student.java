package com.microservices.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="student")
@Data
@AllArgsConstructor @NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column
    private String email;

    @OneToMany
    @Column
    private Long idCourse;
}
