package com.careerit.springcore.scope;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.springcore.scope")
public class UserManager {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(UserManager.class);

        UserService userService1 = context.getBean(UserService.class);
        UserService userService2 = context.getBean(UserService.class);
        UserService userService3 = context.getBean(UserService.class);

        System.out.println(userService1);
        System.out.println(userService2);
        System.out.println(userService3);

        ApplicationContext context1 = new AnnotationConfigApplicationContext(UserManager.class);

        UserService userService4 = context1.getBean(UserService.class);
        UserService userService5 = context1.getBean(UserService.class);
        System.out.println(userService4);
        System.out.println(userService5);


    }
}
