package com.fitness.exerciseapiservice.service;

import com.fitness.exerciseapiservice.model.Exercise;
import com.fitness.exerciseapiservice.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.DatatypeConverter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@Service
public class ExerciseList {


    @Autowired
    private ExerciseRepository exerciseRepository;

    public List<Exercise> setDataUri(List<Exercise> exerciseList) throws IOException {
        for (Exercise e: exerciseList){
            e.setGifUrl(toDataUri(e.getGifUrl()));
        }

        return exerciseList;
    }

    public String toDataUri(String location) throws IOException {
        File file = new File(location);

        // check content type of the file
        String contentType = Files.probeContentType(file.toPath());

        // read data as byte[]
        byte[] data = Files.readAllBytes(file.toPath());

        // convert byte[] to base64(java7)
        String base64str = DatatypeConverter.printBase64Binary(data);

        // convert byte[] to base64(java8)
        // String base64str = Base64.getEncoder().encodeToString(data);

        // cretate "data URI"
        StringBuilder sb = new StringBuilder();
        sb.append("data:");
        sb.append(contentType);
        sb.append(";base64,");
        sb.append(base64str);


        return sb.toString();
    }
}
