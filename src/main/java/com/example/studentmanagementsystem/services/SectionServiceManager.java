package com.example.studentmanagementsystem.services;

import com.example.studentmanagementsystem.dao.SectionDAO;
import com.example.studentmanagementsystem.entities.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionServiceManager implements SectionService{
    @Autowired
    private SectionDAO sectionDAO;
    public SectionServiceManager(){

    }

    @Override
    public List<Section> getSections() {
        return sectionDAO.findAll();
    }

    @Override
    public Section getSection(int sectionId) {
        return sectionDAO.getOne(sectionId);
    }

    @Override
    public Section addSection(Section section) {
        return sectionDAO.save(section);
    }

    @Override
    public Section updateSection(Section section) {
        return sectionDAO.save(section);
    }

    @Override
    public void deleteSection(int sectionId) {
        Section entity = sectionDAO.getOne(sectionId);
        sectionDAO.delete(entity);
    }
}
