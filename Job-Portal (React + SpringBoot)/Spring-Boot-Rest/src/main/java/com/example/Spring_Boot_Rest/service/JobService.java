package com.example.Spring_Boot_Rest.service;

import com.example.Spring_Boot_Rest.model.JobPost;
import com.example.Spring_Boot_Rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobpost){
        repo.save(jobpost);
    }

    public List<JobPost> getAllJobs(){
        return repo.findAll();
    }

    public JobPost getJob(int i) {
        return repo.findById(i).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }

    public void load() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1, "Java Developer", "Need to work on ORM, Spring Web, AOP, REST API", 2,
                        List.of("Java", "Spring", "Hibernate")),
                new JobPost(2, "Python Developer", "Building API in python and ORM", 2,
                        List.of("Python", "Django", "Flask")),
                new JobPost(3, "React Developer", "Interact with API and Elegant Code", 3,
                        List.of("React", "Redux", "Javascript")),
                new JobPost(4, "Angular Developer", "Angular Developer with 5 years of experience", 1,
                        List.of("Angular", "Typescript", "Javascript")),
                new JobPost(5, "Node Developer", "API Dev with Node", 4,
                        List.of("Node", "Express","Javascript"))
        ));
        repo.saveAll(jobs);
    }
}
