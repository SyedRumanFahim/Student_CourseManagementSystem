package com.example.studentmanagementsystem.services;

import com.example.studentmanagementsystem.dao.TeacherDAO;
import com.example.studentmanagementsystem.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceManager implements TeacherService{
    @Autowired
    private TeacherDAO teacherDAO;

    public TeacherServiceManager() {
    }

    @Override
    public List<Teacher> getTeachers() {
        return teacherDAO.findAll();
    }

    @Override
    public Teacher getTeacher(int teacherId) {
        return teacherDAO.getOne(teacherId);
    }

    @Override
    public Teacher addTeacher(Teacher teacher) {
        return teacherDAO.save(teacher);
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return teacherDAO.save(teacher);
    }

    @Override
    public void deleteTeacher(int teacherId) {
        Teacher entity = teacherDAO.getOne(teacherId);
        teacherDAO.delete(entity);
    }
}
