package com.example.studentmanagementsystem.services;

import com.example.studentmanagementsystem.dao.CourseDAo;
import com.example.studentmanagementsystem.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceManager implements CourseService{
    @Autowired
    private CourseDAo courseDAO;
    public CourseServiceManager(){

    }

    @Override
    public List<Course> getCourses() {
        return courseDAO.findAll();
    }

    @Override
    public Course getCourse(int courseId) {
        return courseDAO.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        return courseDAO.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseDAO.save(course);
    }

    @Override
    public void deleteCourse(int courseId) {
        Course entity = courseDAO.getOne(courseId);
        courseDAO.delete(entity);
    }
}
