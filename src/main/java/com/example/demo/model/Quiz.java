package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Quiz {

    @Id
    private Integer id;
    private String title;

    @ManyToMany
    private List<Question> questions;



}
