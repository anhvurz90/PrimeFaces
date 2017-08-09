package com.anhvurz90.sitemonitoring.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anhvurz90.sitemonitoring.entity.Check;
import com.anhvurz90.sitemonitoring.service.CheckService;

import lombok.Getter;
import lombok.Setter;

//@Component
@Getter
@Setter
@ManagedBean
@ViewScoped
public class CheckListController implements Serializable {

    private static final long serialVersionUID = 5914786228857647236L;

    @ManagedProperty("#{checkService}")
    private CheckService checkService;
    
    private Check check = new Check();
    
    public List<Check> loadChecks() {
        return checkService.findAll();
    }
    
    public void save() {
        checkService.save(check);
        check = new Check();
    }
}
