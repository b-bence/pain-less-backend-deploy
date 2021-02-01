package com.fitness.testapiservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {

    @GetMapping("/hello")
    public String testResult(){
        return "Hello";
    }
}
