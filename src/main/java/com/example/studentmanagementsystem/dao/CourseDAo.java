package com.example.studentmanagementsystem.dao;

import com.example.studentmanagementsystem.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDAo extends JpaRepository<Course, Integer> {
}
