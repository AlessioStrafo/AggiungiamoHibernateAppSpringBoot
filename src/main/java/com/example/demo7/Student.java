package com.example.demo7;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "student name", nullable = false)
    private String firstName;
    @Column(name = "student surname", nullable = false)
    private String lastName;
    @Column(name = "student email", nullable = false, unique = true)
    private String email;
}
