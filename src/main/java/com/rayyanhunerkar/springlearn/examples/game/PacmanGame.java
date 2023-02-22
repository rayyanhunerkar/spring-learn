package com.rayyanhunerkar.springlearn.examples.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacmanGame implements GamingConsole {
    public void up() {
        System.out.println("Pacman is moving up");
    }

    public void down() {
        System.out.println("Pacman is moving down");
    }

    public void left() {
        System.out.println("Pacman is moving left");
    }

    public void right() {
        System.out.println("Pacman is moving right");
    }

}
