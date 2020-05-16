package com.w3h.quizpractice.controller;

import com.w3h.quizpractice.entity.Quiz;
import com.w3h.quizpractice.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping(value = "/quiz")
@RequiredArgsConstructor
public class QuizController {

    private final QuizRepository quizRepository;

    @GetMapping(value = "/add")
    public String addQuiz() {
        return "quiz-add";
    }

    @PostMapping(value = "/add")
    public String addQuiz(String question, String answer) {

        log.info("/////////{}, {}//////////",question,answer);

        Quiz quiz = new Quiz();
        quiz.setQuestion(question);
        quiz.setAnswer(answer);

        quizRepository.save(quiz);

        return "redirect:/quiz/list";
    }


    @GetMapping(value = "/list")
    public String getQuizList(Model model) {

        List<Quiz> quizList = quizRepository.findAll();

        model.addAttribute("quizList",quizList);
        return "/quiz-list";
    }


}
