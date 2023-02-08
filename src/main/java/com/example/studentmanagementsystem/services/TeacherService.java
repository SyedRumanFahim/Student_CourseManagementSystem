package com.example.studentmanagementsystem.services;

import com.example.studentmanagementsystem.entities.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeacherService {
    public List<Teacher> getTeachers();
    public Teacher getTeacher(int teacherId);
    public Teacher addTeacher(Teacher teacher);
    public Teacher updateTeacher(Teacher teacher);
    public void deleteTeacher(int teacherId);
}
