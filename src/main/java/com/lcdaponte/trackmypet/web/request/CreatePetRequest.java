package com.lcdaponte.trackmypet.web.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class CreatePetRequest {

    @JsonProperty("name")
    @NotBlank
    private String name;

    @JsonProperty("breed")
    @NotBlank
    private String breed;
    @JsonProperty("birthday")
    @NotNull
    private LocalDate birthday;
    @JsonProperty("weight")
    @NotNull
    private Double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "CreatePetRequest{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", birthday=" + birthday +
                ", weight=" + weight +
                '}';
    }
}
