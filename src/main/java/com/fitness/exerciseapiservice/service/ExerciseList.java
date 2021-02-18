package com.fitness.exerciseapiservice.service;

import com.fitness.exerciseapiservice.model.Exercise;
import com.fitness.exerciseapiservice.repository.ExerciseRepository;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ExerciseList {


    @Autowired
    private ExerciseRepository exerciseRepository;

    public List<Object> getFilteredExerciseList(){
        JSONArray exercises = new JSONArray();
        for (Exercise e: exerciseRepository.findAll()){
            JSONObject eObject = new JSONObject();
            eObject.put("id",e.getId());
            eObject.put("name",e.getName());
            eObject.put("gifUrl",e.getGifUrl());
            eObject.put("description",e.getDescription());
            eObject.put("lengthInSeconds",e.getLengthInSeconds());

            exercises.put(eObject);

        }
        return exercises.toList();
    }

    public JSONObject getFilteredExercise(UUID id){
        Exercise detailedExercise = exerciseRepository.getExerciseById(id);
        JSONObject exerciseObject = new JSONObject();
        exerciseObject.put("id",detailedExercise.getId());
        exerciseObject.put("name",detailedExercise.getName());
        exerciseObject.put("gifUrl",detailedExercise.getGifUrl());
        exerciseObject.put("description",detailedExercise.getDescription());
        exerciseObject.put("lengthInSeconds",detailedExercise.getLengthInSeconds());

        return exerciseObject;
    }

}
