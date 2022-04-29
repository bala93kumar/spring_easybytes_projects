package com.balakumar.example;

import com.balakumar.beans.Vehicle;
import com.balakumar.config.Properties;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.beans.VetoableChangeListener;
import java.util.Random;
import java.util.function.Supplier;


public class ExampleMain3 {

    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(Properties.class);

        Supplier<Vehicle> volkssupplier = new Supplier<Vehicle>() {
            @Override
              public Vehicle get() {
                Vehicle volks = new Vehicle();
                volks.setName("volkswagon");
                return volks;

            }
        };

        Supplier<Vehicle> audisupplier = new Supplier<Vehicle>() {
            @Override
            public Vehicle get() {
                Vehicle audi = new Vehicle();
                audi.setName("volkswagon");
                return audi;

            }
        };

        Random  num = new Random();

        int number = num.nextInt(10);

        System.out.println(number);

        if( (number % 2) == 0){

            context.registerBean("volkswagonbeam", Vehicle.class , volkssupplier);
        }
        else  {
            context.registerBean("audibeam", Vehicle.class , audisupplier );
        }

        Vehicle volks = null;
        Vehicle audi = null;

        try {
             volks  = context.getBean("volkswagonbeam", Vehicle.class);
        }
        catch ( NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("error catching volkVehicle");
        }
        try {
             audi = context.getBean("audibeam", Vehicle.class);
        }
        catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("error getting audiVehicle");
        }

//        var volksVehicl = context.getBean("volkswagonbeam", Vehicle.class);
//
//        System.out.println(volksVehicl.getName());



    }

}