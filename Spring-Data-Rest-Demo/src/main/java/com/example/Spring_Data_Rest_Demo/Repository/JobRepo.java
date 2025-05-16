package com.example.Spring_Data_Rest_Demo.Repository;


import com.example.Spring_Data_Rest_Demo.Model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {


}

