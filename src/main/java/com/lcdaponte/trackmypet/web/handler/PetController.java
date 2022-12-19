package com.lcdaponte.trackmypet.web.handler;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pet")
public class PetController {

    @PostMapping
    public void addPet(){

    }
}
