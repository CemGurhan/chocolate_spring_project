package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChocolateController {

    @Autowired
    private ChocolateRepository chocolateRepository;


    @PostMapping("/addChoc")
    Chocolate post(@RequestBody Chocolate chocolate){
        return chocolateRepository.save(chocolate);
    }

    @GetMapping("/chocolates")
    List<Chocolate> getAll(){
        return chocolateRepository.findAll();

    }


    @GetMapping(value = "/chocolate/{id}")
        Chocolate getChocolate(@PathVariable("id") int id){
            return chocolateRepository.getChocolate(id);

        }

    @GetMapping("/cocoaPercentage")
    List<Chocolate> getChocCocoa(){
        return chocolateRepository.getChocCocoa();
    }




    }





