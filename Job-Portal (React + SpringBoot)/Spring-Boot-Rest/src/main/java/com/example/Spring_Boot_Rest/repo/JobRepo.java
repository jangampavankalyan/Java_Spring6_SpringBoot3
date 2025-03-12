package com.example.Spring_Boot_Rest.repo;

import com.example.Spring_Boot_Rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);

}
//public List<JobPost> getAllJobs(){
//    return jobs;
//}
//
//public void addJob(JobPost job){
//    jobs.add(job);
//}
//
//public JobPost getJob(int i) {
//
//    for(JobPost job : jobs){
//        if(job.getPostId() == i){
//            return job;
//        }
//    }
//
//    return null;
//}
//
//public void updateJob(JobPost jobPost) {
//    for(JobPost jobpost1 : jobs){
//        if(jobpost1.getPostId() == jobPost.getPostId()){
//            jobpost1.setPostProfile(jobPost.getPostProfile());
//            jobpost1.setPostDesc(jobPost.getPostDesc());
//            jobpost1.setReqExperience(jobPost.getReqExperience());
//            jobpost1.setPostTechStack(jobPost.getPostTechStack());
//        }
//    }
//}
//
//public void deleteJob(int postId) {
//    for(JobPost jobPost : jobs){
//        if(jobPost.getPostId() == postId){
//            jobs.remove(jobPost);
//        }
//    }
//}