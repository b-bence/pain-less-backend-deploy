package com.fitness.exerciseapiservice.repository;

import com.fitness.exerciseapiservice.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {


}
