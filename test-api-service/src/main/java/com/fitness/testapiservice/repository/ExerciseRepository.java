package com.fitness.testapiservice.repository;

import com.fitness.testapiservice.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

    List<Exercise> getExercisesByLengthInSecondsGreaterThan(int length);
}
