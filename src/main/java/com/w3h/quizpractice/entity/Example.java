package com.w3h.quizpractice.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name = "EXAMPLE")
@NoArgsConstructor
public class Example {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long exampleId;

    private String text;

}
