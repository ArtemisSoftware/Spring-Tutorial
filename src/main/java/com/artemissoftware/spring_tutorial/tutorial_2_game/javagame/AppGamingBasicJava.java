package com.artemissoftware.spring_tutorial.tutorial_2_game.javagame;

import com.artemissoftware.spring_tutorial.tutorial_2_game.game.GameRunner;
import com.artemissoftware.spring_tutorial.tutorial_2_game.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        //var game = new MarioGame();
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}