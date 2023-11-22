package com.careerit.springcore.di.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@ComponentScan(basePackages = "com.careerit.springcore.di.annotation")
public class Manager {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Manager.class);
        GreetingController greetingController = applicationContext.getBean(GreetingController.class);
        String message = greetingController.greet("Annotations");
        System.out.println(message);

    }
}
