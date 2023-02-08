package com.example.studentmanagementsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {
    @Id
    private int id;
    private String name;
    private String joinDate;
    private String address;
    private String phone;
    private String email;

    public Teacher(int id, String name, String joinDate, String address, String phone, String email) {
        super();
        this.id = id;
        this.name = name;
        this.joinDate = joinDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Teacher() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
