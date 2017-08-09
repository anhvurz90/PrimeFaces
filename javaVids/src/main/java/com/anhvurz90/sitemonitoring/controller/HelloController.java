package com.anhvurz90.sitemonitoring.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.anhvurz90.sitemonitoring.service.HelloSpringService;

//@ManagedBean
@Scope("request")
//@Component
@Named
public class HelloController {

//    @ManagedProperty("#{helloSpringService}")
//    @Autowired
    @Inject
    private HelloSpringService helloSpringService;
    
    public String showHello() {
        return helloSpringService.sayHello();
    }

    public void setHelloSpringService(HelloSpringService helloSpringService) {
        this.helloSpringService = helloSpringService;
    }
    

}
