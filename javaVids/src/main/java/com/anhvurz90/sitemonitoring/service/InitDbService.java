package com.anhvurz90.sitemonitoring.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anhvurz90.sitemonitoring.entity.Check;
import com.anhvurz90.sitemonitoring.repository.CheckRepository;

@Service
public class InitDbService {

    @Autowired
    private CheckRepository checkRepository;
    
    @PostConstruct
    public void init() {
        Check check = new Check();
        check.setName("example");
        check.setUrl("http://www.example.com");
        checkRepository.save(check);
        
        Check check1 = new Check();
        check1.setName("sitemonitoring");
        check1.setUrl("http://www.sitemonitoring.com");
        checkRepository.save(check1);

        Check check2 = new Check();
        check2.setName("javavids");
        check2.setUrl("http://www.javavids.com");
        checkRepository.save(check2);
        
        System.out.println("*** INIT DATABASE FINISH ***");
    }
}
