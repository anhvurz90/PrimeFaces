package com.anhvurz90.sitemonitoring.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anhvurz90.sitemonitoring.entity.Check;
import com.anhvurz90.sitemonitoring.service.CheckService;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class CheckListController {

    @Autowired
    private CheckService checkService;
    
    private Check check = new Check();
    
    public List<Check> loadChecks() {
        return checkService.findAll();
    }
    
    public void save() {
        checkService.save(check);
    }
}
