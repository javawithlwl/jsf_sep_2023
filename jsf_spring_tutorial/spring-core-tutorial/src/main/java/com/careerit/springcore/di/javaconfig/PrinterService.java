package com.careerit.springcore.di.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


public class PrinterService {


    private Printer printer;
    public void print(String msg){
        printer.printMessage(msg);
    }

    public void setPrinter(Printer printer){
        this.printer = printer;
    }

    public Printer getPrinter(){
        return printer;
    }

}
