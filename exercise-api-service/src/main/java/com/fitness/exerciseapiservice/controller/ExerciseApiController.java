package com.fitness.exerciseapiservice.controller;

import com.fitness.exerciseapiservice.model.Exercise;
import com.fitness.exerciseapiservice.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExerciseApiController {

    @Autowired
    private ExerciseRepository exerciseRepository;

    @GetMapping("/hello")
    public String testResult(){
        return "Hello";
    }

    @GetMapping("/all")
    public List<Exercise> getAllExercises(){
        return exerciseRepository.getExercisesByLengthInSecondsGreaterThan(0);
    }
}
