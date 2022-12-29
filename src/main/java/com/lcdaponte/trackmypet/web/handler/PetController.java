package com.lcdaponte.trackmypet.web.handler;

import com.lcdaponte.trackmypet.web.dto.CreatePetDTO;
import com.lcdaponte.trackmypet.web.request.CreatePetRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/pet")
public class PetController {

    Logger logger = LoggerFactory.getLogger(PetController.class);

    @PostMapping
    public void addPet(@Valid @RequestBody CreatePetRequest createPetRequest){
        logger.info(createPetRequest.toString());
    }
}
