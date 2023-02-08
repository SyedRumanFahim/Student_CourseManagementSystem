package com.example.studentmanagementsystem.services;

import com.example.studentmanagementsystem.entities.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(int courseId);
    public Course addCourse(Course course);
    public Course updateCourse(Course course);
    public void deleteCourse(int courseId);

}
