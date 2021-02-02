package com.fitness.testapiservice.service;

import com.fitness.testapiservice.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseList {


    @Autowired
    private ExerciseRepository exerciseRepository;
}
