package com.careerit.springcore.di.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    public String greet(String name){
        if(name == null || name.isEmpty()){
            name = "User";
        }
        return greetingService.greet(name);
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
