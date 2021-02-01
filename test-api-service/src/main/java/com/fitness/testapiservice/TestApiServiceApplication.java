package com.fitness.testapiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TestApiServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApiServiceApplication.class, args);
    }

}
