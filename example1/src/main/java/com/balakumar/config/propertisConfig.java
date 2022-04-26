package com.balakumar.config;

import com.balakumar.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class propertisConfig {


    @Bean(name="auddi")
    Vehicle vehicleMethod() {
        var veh = new Vehicle();

        veh.setName("auddi");

        return veh;

    }

    @Bean(value="bala")

    Vehicle vehicl1()  {

        var veh = new Vehicle();
        veh.setName("bala");

        return veh;
    }


}
