package com.careerit.springcore.di.javaconfig;

public class HpPrinter implements Printer{
        public void printMessage(String  msg){
            System.out.println("Hp Printer : "+msg);
        }
}
