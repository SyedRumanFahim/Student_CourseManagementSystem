package com.example.studentmanagementsystem.dao;

import com.example.studentmanagementsystem.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<Student, Integer> {
}
