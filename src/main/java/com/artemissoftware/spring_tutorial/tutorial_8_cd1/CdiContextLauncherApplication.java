package com.artemissoftware.spring_tutorial.tutorial_8_cd1;

import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Named
class BusinessService2 {
    private DataService2 dataService;

    public BusinessService2(DataService2 dataService) {
        System.out.println("Setter injection");
        this.dataService = dataService;
    }

    public void setDataService(DataService2 dataService) {
        this.dataService = dataService;
    }

    public DataService2 getDataService() {
        return dataService;
    }
}

@Named
class DataService2 {}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)){

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            var bean = context.getBean(BusinessService2.class);
            System.out.println(bean.getDataService());
        }
    }
}
