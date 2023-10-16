package com.careerit.cj.day20;

class A{
    int a = 100;
    A(int num){
        super();
        System.out.println("A");
    }
    public void show(){
        System.out.println(a);
    }
}
class B extends A{
    int a = 200;
    B(){
        super(10);
        System.out.println("B");
    }
    @Override
    public void show(){
        System.out.println(a);
        System.out.println(super.a);
    }

}
public class SuperManager {

    public static void main(String[] args) {

        A obj1 = new A(10);
        obj1.show();


        A obj = new B();
        obj.show();
        System.out.println(obj.a);

    }
}


