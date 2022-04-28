package com.balakumar.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @PostConstruct
    public void initilize(){

        this.name  = "honda";
    }

    @PreDestroy
    public void destry() {
        System.out.println("destroy");
    }

    public void printHello(){
        System.out.println("printing Hello from Component vehicle clas");
    }
}
