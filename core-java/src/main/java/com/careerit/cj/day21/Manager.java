package com.careerit.cj.day21;
class One{
    public void show(){
        System.out.println("One");
    }
    public void show(String name){
        System.out.println("Name :"+name);
    }

}
class Two extends  One{

    public void show(){
        System.out.println("Two");
    }
}
public class Manager {

    public static void main(String[] args) {

            One obj = new Two();
            obj.show("Krish");
            obj.show();
    }

}
