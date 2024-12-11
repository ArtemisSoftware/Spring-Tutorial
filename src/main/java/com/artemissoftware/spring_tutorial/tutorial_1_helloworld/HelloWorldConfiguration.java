package com.artemissoftware.spring_tutorial.tutorial_1_helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Sorrento";
    }

    @Bean
    public int age() {
        return 24;
    }

    @Bean
    public Person person() {
        return new Person("Milo", 19, new Address("Poseidon sea", "Athens"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address phantasy_address) {
        return new Person(name, age, phantasy_address);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address real_address) {
        return new Person(name, age, real_address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address2Qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean(name = "real_address")
    @Primary
    public Address address() {
        return new Address("Athena temple", "Athens");
    }

    @Bean(name = "phantasy_address")
    @Qualifier("address2Qualifier")
    public Address address2() {
        return new Address("Olimpus", "Athens");
    }
}
