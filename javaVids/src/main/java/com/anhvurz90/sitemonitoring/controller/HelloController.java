package com.anhvurz90.sitemonitoring.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.anhvurz90.sitemonitoring.service.HelloSpringService;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ManagedBean
//@Scope("request")
//@Component
//@Named
public class HelloController {

//    @Autowired
//    @Inject
    @ManagedProperty("#{helloSpringService}")
    private HelloSpringService helloSpringService;
    
    public String showHello() {
        return helloSpringService.sayHello();
    }

}
