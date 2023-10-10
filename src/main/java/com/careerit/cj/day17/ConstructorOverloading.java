package com.careerit.cj.day17;

class Calc{
    int a;
    int b;
    float c;
    float d;
    float e;

    public Calc(int a,int b){
        this.a = a;
        this.b = b;
    }
    public Calc(float c,float d){
        this.c = c;
        this.d = d;
    }

    public Calc(float c,int b){

    }
    public Calc(int a,float d){

    }
    public Calc(int a,int b,float c,float d,float e){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

}
public class ConstructorOverloading {


}
