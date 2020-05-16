package com.w3h.quizpractice.repository;

import com.w3h.quizpractice.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
