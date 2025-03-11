package com.example.Spring_JDBC.service;

import com.example.Spring_JDBC.model.Student;
import com.example.Spring_JDBC.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s) {
        repo.save();
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
