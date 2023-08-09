package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import javax.annotation.processing.Generated;
@Data //indicating that data will be mapped to this //
@Entity // lombok will automattically mapp it to the table//
public class Question {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)// // THIS IS FOR THE AUTOMATICALLY SEQUENCE //
    private Integer id;
    private String option1;
    private String option2;  // we are using getters and setters due to the lombok //
    private String option3;
    private String option4;
    private String difficultyLevel;
}



