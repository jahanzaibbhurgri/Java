package com.example.demo.service;

import com.example.demo.model.Question;
import com.example.demo.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public  ResponseEntity<List<Question>> getAllQuestions() {

        try {
            List<Question> questions = questionDao.findAll();
            if (!questions.isEmpty()) {
                // Return the list of questions along with an HTTP status of 200 (OK).
                return new ResponseEntity<>(questions, HttpStatus.OK);
            } else {
                // Return a 404 (Not Found) status if there are no questions.
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();

        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.OK);


    }


    public ResponseEntity<List<Question>> getQuestionsByCategory(String difficultyLevel)
    {
        try {
            List<Question> questions = questionDao.findBydifficultyLevel(difficultyLevel);
            if (!questions.isEmpty()) {
                // Return the list of questions along with an HTTP status of 200 (OK).
                return new ResponseEntity<>(questions, HttpStatus.OK);
            } else {
                // Return a 404 (Not Found) status if there are no questions.
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();

        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.OK);
    }


    public String addQuestion(Question question)
    {
        try {
            //List<Question> questions = questionDao.findBydifficultyLevel(difficultyLevel);
          Question questions = questionDao.save(question);
            if (questions.getId() >= 0 ) {
                // Return the list of questions along with an HTTP status of 200 (OK).
                return "Good";
            } else {
                // Return a 404 (Not Found) status if there are no questions.
                return "bad";
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

          questionDao.save(question);
         return "asdas";
    }

}