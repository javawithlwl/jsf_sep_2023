package com.careerit.cj.day8;

class DefaultCls {
    int a;
    boolean b;
    byte by;
    short s;
    long l;
    float f;
    double d;
    char ch;
    String name;


    void show() {
        System.out.println("int " + a);
        System.out.println("boolean " + b);
        System.out.println("byte " + by);
        System.out.println("short " + s);
        System.out.println("long " + l);
        System.out.println("float " + f);
        System.out.println("double " + d);
        System.out.println("char " + ch);
        System.out.println("String " + name);

    }
}

public class DefaultValueExample {

    public static void main(String[] args) {

        DefaultCls obj = new DefaultCls();
        obj.show();
    }
}
