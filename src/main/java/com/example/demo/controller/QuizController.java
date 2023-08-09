package com.example.demo.controller;

import com.example.demo.model.Question;
import com.example.demo.service.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String Category, @RequestParam int numQuestion , @RequestParam String Title)
    {
        return quizService.createQuiz(Category,numQuestion,Title);
    }

}
