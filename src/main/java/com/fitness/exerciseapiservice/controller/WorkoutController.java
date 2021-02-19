package com.fitness.exerciseapiservice.controller;

import com.fitness.exerciseapiservice.model.Workout;
import com.fitness.exerciseapiservice.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkoutController {

    private static final String ORIGIN = "*";

    @Autowired
    private WorkoutRepository workoutRepository;

    @CrossOrigin(origins = ORIGIN)
    @GetMapping("/workout/all")
    public List<Workout> getAllWorkouts(){
        return workoutRepository.findAll();
    }

    @CrossOrigin(origins = ORIGIN)
    @GetMapping("/workout/{id}")
    public Workout getExerciseById(@PathVariable Long id){
        return workoutRepository.getWorkoutById(id);
    }
}
