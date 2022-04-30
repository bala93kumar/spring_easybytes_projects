package com.balakumar.implementation;

import com.balakumar.beans.Speakers;
import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speakers {


    @Override
    public void playMusic() {

        System.out.println("playing from sony speakers");

    }
}
