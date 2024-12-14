package com.artemissoftware.spring_tutorial.tutorial_9_xmlconfig;

import com.artemissoftware.spring_tutorial.tutorial_2_game.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XmlConfigurationContextLauncherApplication {
    public static void main(String[] args) {
        try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean("name"));
            var bean = context.getBean(GameRunner.class);
            bean.run();
        }
    }
}
