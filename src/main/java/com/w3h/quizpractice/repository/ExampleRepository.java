package com.w3h.quizpractice.repository;

import com.w3h.quizpractice.entity.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<Example, Long> {
}
