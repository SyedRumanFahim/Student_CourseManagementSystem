package com.example.studentmanagementsystem.dao;

import com.example.studentmanagementsystem.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionDAO extends JpaRepository<Section, Integer> {
}
