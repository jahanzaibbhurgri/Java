package com.example.demo.service;

import com.example.demo.dao.QuestionDao;
import com.example.demo.model.Question;
import com.example.demo.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.dao.QuizDao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuizService
{
  @Autowired
  QuizDao quizDao;
  @Autowired
  QuestionDao questionDao;
  public ResponseEntity<String> createQuiz(String category , int numQ, String title)
  {
    List<Question> questionList = questionDao.findRandomQuestionByCategory(category,numQ);
    Quiz quiz =  new Quiz();
    quiz.setTitle(title);
    quiz.setQuestions(questionList);

    quizDao.save(quiz);
    return new ResponseEntity<>("Success", HttpStatus.CREATED);
  }

}
