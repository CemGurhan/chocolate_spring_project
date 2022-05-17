package com.bnta.chocolate.config;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DBseeder implements ApplicationRunner {

    @Autowired
    private EstateRepository estateRepository;

    @Autowired
    private ChocolateRepository chocolateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {


        Estate e1 = new Estate("Gurhan estate","Turkey");
        Estate e2 = new Estate("Todd estate","St Albans");
        Estate e3 = new Estate("Sandford estate","Lloyds");
        Estate e4 = new Estate("Broadhurst estate","West country");
        Estate e5 = new Estate("Bartholomew","FISH");

        Chocolate c1 = new Chocolate("lint",70,e2);
        Chocolate c2 = new Chocolate("liwww",70,e1);
        Chocolate c3 = new Chocolate("leeee",230,e5);
        Chocolate c4 = new Chocolate("Toblerone",50,e3);
        Chocolate c5 = new Chocolate("Mars",40,e1);
        Chocolate c6 = new Chocolate("Galaxy",20,e4);
        Chocolate c7 = new Chocolate("Yorkie",60,e4);
        Chocolate c8 = new Chocolate("Milky Way",1,e2);
        Chocolate c9 = new Chocolate("Dairy Milk",30,e5);
        Chocolate c10 = new Chocolate("Curly wurly",7,e2);

        estateRepository.saveAll(List.of(e1,e2,e3,e4,e5));
        chocolateRepository.saveAll(List.of(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10));





    }
}
