package com.example.studentmanagementsystem.services;

import com.example.studentmanagementsystem.entities.Section;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SectionService {
    public List<Section> getSections();
    public Section getSection(int sectionId);
    public Section addSection(Section section);
    public Section updateSection(Section section);
    public void deleteSection(int sectionId);
}
