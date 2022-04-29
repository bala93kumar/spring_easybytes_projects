package com.balakumar.config;

import com.balakumar.beans.Person;
import com.balakumar.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Properties {


@Bean
    public  Vehicle veh () {

    Vehicle veh = new Vehicle();
    veh.setName("audi");
    return veh ;

}


//autowiring using manual approach

/*
@Bean
    public Person person() {

    Person per = new Person();
    per.setName("bala");
//    per.setVehicle(veh());
    return per;

 */


//    autowiring using method parameter
@Bean
public Person person(Vehicle vehicle) {

    Person per = new Person();
    per.setName("bala");
    per.setVehicle(vehicle);
    return per;



}





}
