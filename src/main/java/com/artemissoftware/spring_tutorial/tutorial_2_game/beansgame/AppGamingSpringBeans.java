package com.artemissoftware.spring_tutorial.tutorial_2_game.beansgame;

import com.artemissoftware.spring_tutorial.tutorial_2_game.game.GameRunner;
import com.artemissoftware.spring_tutorial.tutorial_2_game.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpringBeans {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){

            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
