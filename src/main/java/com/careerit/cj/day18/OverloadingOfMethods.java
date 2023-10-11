package com.careerit.cj.day18;

public class OverloadingOfMethods {

    public int add(int a, int b) {
        return a + b;
    }
    public int add(char a,char b){
        return a+b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public float add(int a, float b) {
        return a + b;
    }

    public float add(float a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingOfMethods obj = new OverloadingOfMethods();
        double res = obj.add(2.56f, 2.45f);  // char -> int -> float/long/double
        System.out.println(res);
    }


}
