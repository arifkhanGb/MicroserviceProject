package com.question.controller;

import com.question.entities.Question;
import com.question.services.QuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/qus")
public class QuesController {

    @Autowired
    QuesService quesService;
    @PostMapping("/add")
    public Question add(@RequestBody Question question){
        return quesService.add(question);

    }

    @GetMapping("/")
    public List<Question> getAll(){
        return quesService.get();
    }

    @GetMapping("/{id}")
    public Question get(@PathVariable Long id){
        return quesService.get(id);
    }

    // get all question of specific quiz

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId){
        return  quesService.getQuestionOfQuiz(quizId);
    }
}
