package com.careerit.springcore.di.annotation;


import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet(String name) {
        return "Hello "+name+", Welcome to Spring Core!";
    }
}
