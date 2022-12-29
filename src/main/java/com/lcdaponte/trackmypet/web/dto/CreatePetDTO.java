package com.lcdaponte.trackmypet.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;

public class CreatePetDTO {

    @JsonProperty("name")
    private String name;
    @JsonProperty("birthday")
    private LocalDate birthday;
    @JsonProperty("weight")
    private Double weight;

}
