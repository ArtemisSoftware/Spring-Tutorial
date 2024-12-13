package com.artemissoftware.spring_tutorial.tutorial_4_business;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessSpringContextLauncherApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(BusinessSpringContextLauncherApplication.class)){

            var bean = context.getBean(BusinessCalculationService.class);
            System.out.println(bean.findMax());
        }
    }
}
