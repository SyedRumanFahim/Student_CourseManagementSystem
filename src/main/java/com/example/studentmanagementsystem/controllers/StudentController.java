package com.example.studentmanagementsystem.controllers;

import com.example.studentmanagementsystem.entities.Student;
import com.example.studentmanagementsystem.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/home")
    public String home(){
        return "Welcome to student management System";
    }
    @GetMapping("/students")
    public List<Student> getStudents(){
        return this.studentService.getStudents();
    }
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable String studentId){
        return this.studentService.getStudent(Integer.parseInt(studentId));
    }
    @PostMapping(path = "/students", consumes = "application/json")
    public Student addStudent(@RequestBody Student student){
        return this.studentService.addStudent(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        return this.studentService.updateStudent(student);
    }

    @DeleteMapping("/students/{studentId}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String studentId){
        try{
            this.studentService.deleteStudent(Integer.parseInt(studentId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
