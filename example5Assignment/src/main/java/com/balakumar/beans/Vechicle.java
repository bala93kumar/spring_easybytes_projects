package com.balakumar.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vechicle {

    private String vehName="bmw";

    @Autowired
    private VehicleServie  services;

    public void playMusic() {

        services.getSpeaker();
    }

    public String getVehName() {
        return vehName;
    }

    public void setVehName(String vehName) {
        this.vehName = vehName;
    }

    public VehicleServie getServices() {
        return services;
    }

    public void setServices(VehicleServie services) {
        this.services = services;
    }
}
