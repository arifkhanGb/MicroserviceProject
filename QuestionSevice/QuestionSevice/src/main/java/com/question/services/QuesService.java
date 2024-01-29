package com.question.services;

import com.question.entities.Question;

import java.util.List;

public interface QuesService {

    Question add(Question quiz);
    List<Question> get();

    Question get(long id);

    List<Question> getQuestionOfQuiz(Long quizId);
}
