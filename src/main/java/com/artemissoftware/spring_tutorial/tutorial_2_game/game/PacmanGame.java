package com.artemissoftware.spring_tutorial.tutorial_2_game.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("walk and eat up");
    }

    @Override
    public void down() {
        System.out.println("walk and eat down");
    }

    @Override
    public void left() {
        System.out.println("walk and eat left");
    }

    @Override
    public void right() {
        System.out.println("walk and eat right");
    }
}
