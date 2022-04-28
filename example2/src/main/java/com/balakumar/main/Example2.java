package com.balakumar.main;

import com.balakumar.beans.Vehicle;
import com.balakumar.config.PropertiesConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {

    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(PropertiesConfig.class);

        Vehicle veh = context.getBean(Vehicle.class);

        System.out.println(veh.getName());

        veh.printHello();

        context.close();

    }
}
