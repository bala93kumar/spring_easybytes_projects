package com.balakumar.implementation;

import com.balakumar.beans.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeaker implements Speakers {

    @Override
    public void playMusic() {
        System.out.println("playing music from bose speakers");
    }
}
