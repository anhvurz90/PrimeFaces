package com.anhvurz90.sitemonitoring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anhvurz90.sitemonitoring.entity.Check;
import com.anhvurz90.sitemonitoring.repository.CheckRepository;

@Service
public class CheckService {

    @Autowired
    private CheckRepository checkRepository;
    
    public List<Check> findAll() {
        return checkRepository.findAll();
    }
}
