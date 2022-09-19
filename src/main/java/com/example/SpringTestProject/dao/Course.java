package com.example.SpringTestProject.dao;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String first_name;
    @Column
    private String author;
}
