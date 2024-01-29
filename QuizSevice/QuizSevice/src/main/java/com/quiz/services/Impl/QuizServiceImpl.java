package com.quiz.services.Impl;

import com.quiz.entities.Quiz;
import com.quiz.repository.QuizRepository;
import com.quiz.services.QuizeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizeServices {

    @Autowired
    QuizRepository quizRepository;


    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz get(long id) {
        return quizRepository.findById(id).orElseThrow(() -> new RuntimeException( "quiz not found"));
    }
}
