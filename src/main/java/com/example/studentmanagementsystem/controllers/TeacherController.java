package com.example.studentmanagementsystem.controllers;

import com.example.studentmanagementsystem.entities.Teacher;
import com.example.studentmanagementsystem.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @GetMapping("/teachers")
    public List<Teacher> getTeachers(){
        return this.teacherService.getTeachers();
    }
    @GetMapping("/teachers/{teacherid}")
    public Teacher getTeacher(@PathVariable String teacherId){
        return this.teacherService.getTeacher(Integer.parseInt(teacherId));
    }
    @PostMapping(path = "/teachers", consumes = "application/json")
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return this.teacherService.addTeacher(teacher);
    }
    @PutMapping("/teachers")
    public Teacher updateTeacher(@RequestBody Teacher teacher){
        return this.teacherService.updateTeacher(teacher);
    }
    @DeleteMapping("/teachers/{teacherId}")
    public ResponseEntity<HttpStatus> deleteTeacher(String teacherId){
        try{
            this.teacherService.deleteTeacher(Integer.parseInt(teacherId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
