package com.example.studentmanagementsystem.controllers;

import com.example.studentmanagementsystem.entities.Section;
import com.example.studentmanagementsystem.services.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SectionController {
    @Autowired
    private SectionService sectionService;

    @GetMapping("/sections")
    public List<Section> getSections(){
        return this.sectionService.getSections();
    }
    @GetMapping("/sections/{sectionId}")
    public Section getSection(@PathVariable String sectionId){
        return this.sectionService.getSection(Integer.parseInt(sectionId));
    }
    @PostMapping(value = "/sections", consumes = "application/json")
    public Section addSection(@RequestBody Section section){
        return this.sectionService.addSection(section);
    }
    @PutMapping("/sections")
    public Section updateSection(@RequestBody Section section){
        return this.sectionService.updateSection(section);
    }
    @DeleteMapping("/sections/{sectionId}")
    public ResponseEntity<HttpStatus> deleteSection(@PathVariable String sectionId){
        try{
            this.sectionService.deleteSection(Integer.parseInt(sectionId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
