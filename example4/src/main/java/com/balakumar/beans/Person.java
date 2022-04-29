package com.balakumar.beans;


import org.springframework.beans.factory.annotation.Autowired;

public class Person {

    public Person() {

        System.out.println("generated from person pojo class");
    }
    private String name;


    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
