package com.artemissoftware.spring_tutorial.tutorial_3_di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{
    Dependency1 dependency1;
    Dependency2 dependency2;

    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString(){
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency1{ }

@Component
class Dependency2{ }

@Configuration
@ComponentScan
public class DiLauncherApp {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(DiLauncherApp.class)){
            var bean = context.getBean(YourBusinessClass.class);

            System.out.println(bean.toString());
        }
    }
}

