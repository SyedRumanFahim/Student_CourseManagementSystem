package com.example.studentmanagementsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Section {
    @Id
    private int id;
    private String name;
    private String year;
    private String session;

    public Section(int id, String name, String year, String session) {
        super();
        this.id = id;
        this.name = name;
        this.year = year;
        this.session = session;
    }

    public Section() {
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", session='" + session + '\'' +
                '}';
    }
}
