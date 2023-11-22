package com.careerit.springcore.di.xml;


import org.springframework.stereotype.Service;


public class GreetingServiceImpl implements GreetingService{
    @Override
    public String greet(String name) {
        return "Hello "+name+", Welcome to Spring Core!";
    }
}
