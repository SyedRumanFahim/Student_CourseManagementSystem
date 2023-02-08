package com.example.studentmanagementsystem.services;

import com.example.studentmanagementsystem.entities.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public List<Student> getStudents();
    public Student getStudent(int studentId);
    public Student addStudent(Student student);
    public Student updateStudent(Student student);
    public void deleteStudent(int studentId);

}
