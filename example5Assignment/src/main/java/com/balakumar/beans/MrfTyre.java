package com.balakumar.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MrfTyre implements  Tyre{
    @Override
    public void rotate() {
        System.out.println("rotating from MRF");
    }
}
