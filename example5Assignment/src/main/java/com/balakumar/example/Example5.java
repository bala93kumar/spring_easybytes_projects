package com.balakumar.example;

import com.balakumar.beans.Person;
import com.balakumar.properties.Properties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example5 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Properties.class);
        Person person = context.getBean(Person.class);
        person.getVeh().getServices().playMucis();
        person.getVeh().getServices().rotatetyre();


    }
}
