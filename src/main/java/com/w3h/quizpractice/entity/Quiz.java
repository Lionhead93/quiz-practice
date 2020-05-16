package com.w3h.quizpractice.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "QUIZ")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long quizId;

    private String question;

    @OneToMany(targetEntity = Example.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Example> exampleList;

    private String answer;

}
