package com.example.Quiz.App.dao;

import com.example.Quiz.App.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
