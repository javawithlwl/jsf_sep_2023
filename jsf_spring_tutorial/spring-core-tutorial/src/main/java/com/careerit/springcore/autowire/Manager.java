package com.careerit.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.springcore.autowire")
public class Manager {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
        UserController userController = context.getBean(UserController.class);
        userController.search("sh").forEach(System.out::println);

    }
}
