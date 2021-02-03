package com.fitness.exerciseapiservice.service;

import com.fitness.exerciseapiservice.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseList {


    @Autowired
    private ExerciseRepository exerciseRepository;
}
