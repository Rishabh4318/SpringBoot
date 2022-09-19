package com.example.SpringTestProject.jpa;

import com.example.SpringTestProject.dao.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataBaseRepository extends JpaRepository<Course,Long> {
}
