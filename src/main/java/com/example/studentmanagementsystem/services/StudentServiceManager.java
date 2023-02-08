package com.example.studentmanagementsystem.services;

import com.example.studentmanagementsystem.dao.StudentDAO;
import com.example.studentmanagementsystem.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudentServiceManager implements StudentService{
    @Autowired
    private StudentDAO studentDAO;

    public StudentServiceManager(){

    }
    @Override
    public List<Student> getStudents() {
        return studentDAO.findAll();
    }

    @Override
    public Student getStudent(int studentId) {
        return studentDAO.getOne(studentId);
    }

    @Override
    public Student addStudent(Student student) {
        return studentDAO.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentDAO.save(student);
    }

    @Override
    public void deleteStudent(int studentId) {
        Student entity = studentDAO.getOne(studentId);
        studentDAO.delete(entity);

    }
}
