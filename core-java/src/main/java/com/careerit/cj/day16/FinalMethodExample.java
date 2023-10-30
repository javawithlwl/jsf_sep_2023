package com.careerit.cj.day16;

class One{
    final void perform(int a,int b){
        int res = a + b;
        System.out.println(res);
    }
}
class Two extends  One{

}
final class C1{
    public void m1(){
        System.out.println("M1 method");
    }
    public final void m2(){
        System.out.println("M2 method");
    }
}
class C2{
    public void m1(){
        System.out.println("M1 method");
    }
    public void m3(){
        System.out.println("M3 method");
    }
}

public class FinalMethodExample {
}
