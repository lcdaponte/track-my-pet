package com.lcdaponte.trackmypet.core.repository.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private String id;
    @Column
    private String name;
    @Column
    private String breed;
    @Column
    private LocalDate birthday;
    @Column
    private Double weight;

    public Pet() {
    }

    public String getId() {
        return id;
    }

    public void setUuid(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getBirthday() {
        return birthday;
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
}
