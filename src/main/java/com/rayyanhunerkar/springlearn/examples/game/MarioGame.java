package com.rayyanhunerkar.springlearn.examples.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("marioGame")
public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("Mario is jumping");
    }

    public void down() {
        System.out.println("Go into a hole");
    }

    public void left() {
        System.out.println("Mario is moving back");
    }

    public void right() {
        System.out.println("Mario is moving forward");
    }

}
