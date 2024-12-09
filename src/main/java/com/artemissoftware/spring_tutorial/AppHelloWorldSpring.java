package com.artemissoftware.spring_tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {
    public static void main(String[] args) {

        // Launch spring context

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        var bean = context.getBean("name");
        System.out.println(bean);
    }
}