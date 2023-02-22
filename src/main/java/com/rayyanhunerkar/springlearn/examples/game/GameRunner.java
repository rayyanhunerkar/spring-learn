package com.rayyanhunerkar.springlearn.examples.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private final GamingConsole game;

    public GameRunner(@Qualifier("marioGame") GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Game is running: " + game);

        game.up();
        game.down();
        game.left();
        game.right();

    }
}
