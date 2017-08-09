package com.anhvurz90.sitemonitoring.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.anhvurz90.sitemonitoring.service.HelloSpringService;

@ManagedBean
public class HelloController {

    @ManagedProperty("#{helloSpringService}")
    private HelloSpringService helloSpringService;
    
    public String showHello() {
        return helloSpringService.sayHello();
    }

    public void setHelloSpringService(HelloSpringService helloSpringService) {
        this.helloSpringService = helloSpringService;
    }
    

}
