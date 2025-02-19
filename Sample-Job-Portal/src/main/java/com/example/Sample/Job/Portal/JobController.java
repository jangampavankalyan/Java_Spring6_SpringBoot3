package com.example.Sample.Job.Portal;


import com.example.Sample.Job.Portal.model.JobPost;
import com.example.Sample.Job.Portal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }

    @GetMapping("/addjob")
    public String addJob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        service.addJob(jobPost);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewJobs(Model m){
        System.out.println("Here");
        List<JobPost> jobs = service.getAllJobs();
        System.out.println(jobs);
        m.addAttribute("jobPosts",jobs);
        return "viewalljobs";
    }

}
