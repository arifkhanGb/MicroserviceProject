package com.quiz.controller;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    QuizeServices quizeServices;

    @PostMapping("/add")
   public Quiz add(@RequestBody Quiz quiz){
        return quizeServices.add(quiz);

    }

    @GetMapping("/")
    public List<Quiz> getAll(){
        return quizeServices.get();
    }

    @GetMapping("/{id}")
    public Quiz get(@PathVariable Long id){
        return quizeServices.get(id);
    }
}
