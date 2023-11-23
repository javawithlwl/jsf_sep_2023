package com.careerit.springcore.di.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.springcore.di.javaconfig")
public class Manager {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
        PrinterService printerService = context.getBean(PrinterService.class);
        printerService.print("Hello Spring");

        NumberOperations obj = context.getBean(NumberOperations.class);
        obj.showNumbers(new int[]{3,4,2,1,5,6,7,8,9,10});

    }
}
