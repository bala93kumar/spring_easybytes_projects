package com.balakumar.main;

import com.balakumar.beans.Vehicle;
import com.balakumar.config.propertisConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {


    public static void main(String[] args) {

        Vehicle vehicleself = new Vehicle();

        vehicleself.setName("bmx");

        System.out.println( "Printing the object not handled by spring : " + vehicleself.getName());

        var context = new AnnotationConfigApplicationContext(propertisConfig.class);

        Vehicle veh = context.getBean("auddi", Vehicle.class);

        System.out.println("value is from spring app context:" + veh.getName());

        // getting bean with a custom name by default it will be the method name will be the beam name

        Vehicle vehBala =   context.getBean("bala",  Vehicle.class);
        System.out.println("value is from beam app " + vehBala.getName());



    }
}
