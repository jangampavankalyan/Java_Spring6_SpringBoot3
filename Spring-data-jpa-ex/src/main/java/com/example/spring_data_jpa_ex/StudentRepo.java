package com.example.spring_data_jpa_ex;

import com.example.spring_data_jpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    @Query("select s from Student s where s.name = ?1") //We can get the values without this @Query
    List<Student> findByName(String name); // Because JPA uses DSL (Domain Specific Language)

    List<Student> findByMarks(int marks); //Even though there is no @Query but it executes

    List<Student> findByMarksGreaterThan(int marks);
}
