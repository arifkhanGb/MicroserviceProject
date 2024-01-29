package com.quiz.services;

import com.quiz.entities.Quiz;

import java.util.List;

public interface QuizeServices {
    Quiz add(Quiz quiz);
    List<Quiz> get();

    Quiz get(long id);
}
