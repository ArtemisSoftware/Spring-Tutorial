package com.artemissoftware.spring_tutorial.tutorial_6_beanscope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Component
class NormalClass {}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {}

@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)){

            var beanNormal1 = context.getBean(NormalClass.class);
            var beanNormal2 = context.getBean(NormalClass.class);
            System.out.println(beanNormal1);
            System.out.println(beanNormal2);

            var beanPrototype1 = context.getBean(PrototypeClass.class);
            var beanPrototype2 = context.getBean(PrototypeClass.class);
            var beanPrototype3 = context.getBean(PrototypeClass.class);

            System.out.println(beanPrototype1);
            System.out.println(beanPrototype2);
            System.out.println(beanPrototype3);
        }
    }
}
