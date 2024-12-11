package com.artemissoftware.spring_tutorial;

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

    @Bean(name = "real_address")
    @Primary
    public Address address() {
        return new Address("Athena temple", "Athens");
    }

    @Bean(name = "phantasy_address")
    public Address address2() {
        return new Address("Olimpus", "Athens");
    }
}
