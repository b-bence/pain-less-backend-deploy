package com.fitness.exerciseapiservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Exercise {

    @Id
    private UUID id;

    private String name;

    private String gifUrl;

    @Column(length = 2048)
    private String description;

    private String gifLocation;

    private Integer lengthInSeconds;
}
