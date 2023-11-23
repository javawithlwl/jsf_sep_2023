package com.careerit.springcore.di.javaconfig;

import org.springframework.stereotype.Component;


public class SonyPrinter implements Printer {

        public void printMessage(String  msg){
            System.out.println("Sony Printer : "+msg);
        }
}
