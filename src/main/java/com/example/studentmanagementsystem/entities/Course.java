package com.example.studentmanagementsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private int id;
    private String title;
    private String department;

    public Course(int id, String title, String department) {
        super();
        this.id = id;
        this.title = title;
        this.department = department;
    }

    public Course() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
