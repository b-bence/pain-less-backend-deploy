package com.fitness.exerciseapiservice.service;

import com.fitness.exerciseapiservice.model.Exercise;
import com.fitness.exerciseapiservice.repository.ExerciseRepository;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseList {


    @Autowired
    private ExerciseRepository exerciseRepository;

    public List<Object> exercisesWithoutLocation(){
        JSONArray exercises = new JSONArray();
        for (Exercise e: exerciseRepository.findAll()){
            JSONObject eObject = new JSONObject();
            eObject.put("id",e.getId());
            eObject.put("name",e.getName());
            eObject.put("gifUrl",e.getGifUrl());
            eObject.put("description",e.getDescription());

            exercises.put(eObject);

        }
        return exercises.toList();
    }

}
