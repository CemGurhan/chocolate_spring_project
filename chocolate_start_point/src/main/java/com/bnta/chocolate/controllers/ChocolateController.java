package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChocolateController {

    @Autowired
    private ChocolateRepository chocolateRepository;

    @GetMapping("/chocolates")
    List<Chocolate> getAll(){
        return chocolateRepository.findAll();

    }

    @GetMapping(value = "/{id}")
        Chocolate getChocolate(@PathVariable("id") int id){
            return chocolateRepository.getChocolate(id);

        }
    }





