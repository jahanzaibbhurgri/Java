package com.example.demo.controller;


import com.example.demo.model.Question;
import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    //would suggest you to use constructors or getter/setter //
    @Autowired  //this will directly injected from questionservice class to this //
    QuestionService questionService;
    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions()
    {
         return questionService.getAllQuestions();
    }
    @GetMapping("category/{difficultyLevel}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String difficultyLevel)
    {
        return questionService.getQuestionsByCategory(difficultyLevel);
    }

    @PostMapping("add")
    public String addQuestion(@Validated @RequestBody Question question)
    {
        return questionService.addQuestion(question);
    }

}