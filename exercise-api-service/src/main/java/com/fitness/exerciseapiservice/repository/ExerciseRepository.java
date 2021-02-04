package com.fitness.exerciseapiservice.repository;

import com.fitness.exerciseapiservice.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExerciseRepository extends JpaRepository<Exercise, UUID> {

    Exercise getExerciseById(UUID id);

}
