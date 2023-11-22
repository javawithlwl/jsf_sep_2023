package com.careerit.springcore.di.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Manager {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("greet-bean.xml");
        GreetingController greetingController = applicationContext.getBean(GreetingController.class);
        String message = greetingController.greet("Krish");
        System.out.println(message);

    }
}
