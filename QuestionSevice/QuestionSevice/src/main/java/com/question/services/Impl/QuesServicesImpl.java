package com.question.services.Impl;

import com.question.repository.QuestionRepository;
import com.question.entities.Question;
import com.question.services.QuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuesServicesImpl implements QuesService {

    @Autowired
    QuestionRepository questionRepository;
    @Override
    public Question add(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    @Override
    public Question get(long id) {
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

    @Override
    public List<Question> getQuestionOfQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
