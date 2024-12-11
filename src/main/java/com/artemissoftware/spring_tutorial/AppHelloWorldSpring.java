package com.artemissoftware.spring_tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class AppHelloWorldSpring {
    public static void main(String[] args) {

        // Launch spring context

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        var bean = context.getBean("name");
        System.out.println(bean);
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("person5Qualifier"));
        System.out.println(context.getBean("real_address"));
        System.out.println(context.getBean(Address.class));

        System.out.println("\n-----getBeanDefinitionNames-----");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
    }
}