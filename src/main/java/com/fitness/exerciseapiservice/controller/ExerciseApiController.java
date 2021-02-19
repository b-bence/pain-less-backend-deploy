package com.fitness.exerciseapiservice.controller;

import com.fitness.exerciseapiservice.model.Exercise;
import com.fitness.exerciseapiservice.repository.ExerciseRepository;
import com.fitness.exerciseapiservice.repository.GifLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

@RestController
public class ExerciseApiController {

    private static final String ORIGIN = "*";

    @Autowired
    private ExerciseRepository exerciseRepository;


    @Autowired
    private GifLocationRepository gifLocationRepository;

    @CrossOrigin(origins = ORIGIN)
    @GetMapping("exercise/all")
    public List<Exercise> getAllExercises(){
        return exerciseRepository.findAll();
    }

    @CrossOrigin(origins = ORIGIN)
    @GetMapping(value = "exercise/image/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<Resource> returnImage(@PathVariable UUID id, HttpServletResponse response) throws IOException {
        final ByteArrayResource inputStream = new ByteArrayResource(Files.readAllBytes(Paths.get(
                gifLocationRepository.getGifLocationByExerciseId(id).getLocation()
        )));
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentLength(inputStream.contentLength())
                .body(inputStream);
    }

    @CrossOrigin(origins = ORIGIN)
    @GetMapping("/exercise/{id}")
    public Exercise getExerciseById(@PathVariable UUID id){
        return exerciseRepository.getExerciseById(id);
    }




}
