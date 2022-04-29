package com.balakumar.main;

import com.balakumar.beans.Person;
import com.balakumar.beans.Vehicle;
import com.balakumar.config.Properties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Properties.class);

//         Vehicle veh = context.getBean(Vehicle.class);
         Person per = context.getBean(Person.class);

//         System.out.println("Vehicle name from spring context" + veh.getName());
         System.out.println("Person name from spring context " + per.getName());
         System.out.println("vehicle that person owns :" + per.getVehicle());



    }
}
