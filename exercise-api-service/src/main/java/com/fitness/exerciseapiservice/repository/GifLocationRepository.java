package com.fitness.exerciseapiservice.repository;

import com.fitness.exerciseapiservice.model.GifLocation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GifLocationRepository extends JpaRepository<GifLocation, Long> {


    GifLocation getGifLocationByExerciseId(UUID id);
}
