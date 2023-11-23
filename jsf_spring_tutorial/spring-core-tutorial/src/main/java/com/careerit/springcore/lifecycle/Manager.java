package com.careerit.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.springcore.lifecycle")
public class Manager {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
        DataLoaderService dataLoaderService = context.getBean(DataLoaderService.class);
        context.close();
    }
}
