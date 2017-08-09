package com.anhvurz90.sitemonitoring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Check {

    @Id
    @GeneratedValue
    private Integer id;
    
    private String name;
    
    private String url;
    
}
