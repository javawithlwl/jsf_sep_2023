package com.careerit.cj.day5;

public class TypeCastingWithPrimitiveTypes {

    // primitive types
    // byte, short, int, long, float, double, char, boolean

    // Type casting
    // 1. Implicit type casting
    // int a = 10;
    // double b = a;
    // 2. Explicit type casting
    // double a = 10.56;
    // int b = (int)a;

    public static void main(String[] args) {

        // Implicit type casting
        int a = 10;
        double b = a;
        System.out.println(b);
        // Explicit type casting
        double c = 10.56;
        int d = (int)c;
        System.out.println(d);
    }

}
