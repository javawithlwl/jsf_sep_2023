package com.careerit.cj.day20;
sealed abstract class Printer permits HPPrinter,CanonPrinter,SonyPrinter {
    public abstract void print(String data);
}
final class HPPrinter extends Printer{
    public void print(String data){
        System.out.println("HP Printer : "+data);
    }
}
final class CanonPrinter extends Printer{
    public void print(String data){
        System.out.println("Canon Printer : "+data);
    }
}
final class SonyPrinter extends Printer{
    public void print(String data){
        System.out.println("Sony Printer : "+data);
    }
}

public class PrinterManager {
}
