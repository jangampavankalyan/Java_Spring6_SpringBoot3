package com.example.Sample.Job.Portal.repo;

import com.example.Sample.Job.Portal.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1,"A","Good",1,List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
            new JobPost(2,"B","Good",1,List.of("Core Java", "J2EE", "Spring Boot", "Hibernate"))

    ));

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
    }
}
