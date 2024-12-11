package com.artemissoftware.spring_tutorial.tutorial_2_game.beansgame;

import com.artemissoftware.spring_tutorial.tutorial_2_game.game.GameRunner;
import com.artemissoftware.spring_tutorial.tutorial_2_game.game.GamingConsole;
import com.artemissoftware.spring_tutorial.tutorial_2_game.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner() {
        return new GameRunner(game());
    }
}
