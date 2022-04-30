package com.balakumar.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name="bala";

    @Autowired
    private Vechicle veh;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vechicle getVeh() {
        return veh;
    }

    public void setVeh(Vechicle veh) {
        this.veh = veh;
    }
}
