package com.artemissoftware.spring_tutorial.tutorial_2_game.beansgame;

import com.artemissoftware.spring_tutorial.tutorial_2_game.game.GameRunner;
import com.artemissoftware.spring_tutorial.tutorial_2_game.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.artemissoftware.spring_tutorial.tutorial_2_game.game")
public class AppGamingSpringBeans {

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(AppGamingSpringBeans.class)){

            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
