package com.balakumar.beans;

public class Vehicle {

    public Vehicle() {

        System.out.println("printing from Vehicle class");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {

        System.out.println("printing hellow from component vehicle");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
