package com.w3h.quizpractice.repository;

import com.w3h.quizpractice.entity.Example;
import com.w3h.quizpractice.entity.Quiz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class QuizRepositoryTest {

    @Autowired
    QuizRepository quizRepo;

    @Autowired
    ExampleRepository exampleRepo;

    @Test
    void test() {

        List<Example> list = new ArrayList<>();

        Example example = new Example();
        example.setText("TEST_EXAMPLE");

        list.add(example);

        Quiz quiz = new Quiz();
        quiz.setQuestion("TEST_QUESTION");
        quiz.setAnswer("TEST_ANSWER");
        quiz.setExampleList(list);

        quizRepo.save(quiz);
        assertFalse(quizRepo.findAll().isEmpty());
    }

}