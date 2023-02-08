package com.example.studentmanagementsystem.dao;

import com.example.studentmanagementsystem.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherDAO extends JpaRepository<Teacher, Integer> {

}
