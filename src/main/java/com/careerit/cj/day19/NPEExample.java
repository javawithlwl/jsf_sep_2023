package com.careerit.cj.day19;

class C1{
    C1(int a){
        System.out.println("C1 constructor");
    }

}
class C2 extends C1{
    C2(){
        super(10);
        System.out.println("C2 constructor");
    }
}

public class NPEExample {

    public static void main(String[] args) {

            C2 obj = new C2();


    }

    public static void showAccountInfo(Account acc) {
    		acc.showInfo();
    }
}
