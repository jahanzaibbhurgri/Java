package com.example.demo.dao;

import com.example.demo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {
    List<Question> findBydifficultyLevel(String difficultyLevel);
    @Query(value = "SELECT q FROM Question q WHERE q.category = :category ORDER BY RAND() LIMIT :numQ")
    List<Question> findRandomQuestionByCategory(@Param("category") String category, @Param("numQ") int numQ);
}
