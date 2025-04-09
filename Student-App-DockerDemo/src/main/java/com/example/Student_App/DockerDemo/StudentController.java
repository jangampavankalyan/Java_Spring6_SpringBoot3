package com.example.Student_App.DockerDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/getStudents")
    public List<Students> getStudents(){
        return repo.findAll();
    }

    @RequestMapping("/addStudent")
    public void addStudent(){
        Students s = new Students();
        s.setName("Harsh");
        s.setAge(22);
        repo.save(s);
    }
}
