package com.balakumar.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServie {


     @Autowired
     private Speakers speaker;

     @Autowired
     private Tyre tyre;

     public void playMucis() {
          speaker.playMusic();
     }

     public void rotatetyre() {
          tyre.rotate();
     }


     public Speakers getSpeaker() {
          return speaker;
     }

     public void setSpeaker(Speakers speaker) {
          this.speaker = speaker;
     }

     public Tyre getTyre() {
          return tyre;
     }

     public void setTyre(Tyre tyre) {
          this.tyre = tyre;
     }


}
