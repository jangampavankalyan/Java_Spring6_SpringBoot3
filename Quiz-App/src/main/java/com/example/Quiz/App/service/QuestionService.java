package com.example.Quiz.App.service;

import com.example.Quiz.App.dao.QuestionDao;
import com.example.Quiz.App.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "Success";
    }

    public String updateQuestion(Question question) {
        questionDao.save(question);
        return "Success";
    }
}
