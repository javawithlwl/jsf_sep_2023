package com.careerit.cj.day5;

public class FibonacciSeries {

    // 0 1 1 2 3 5 8 13 21 34

    public static void main(String[] args) {
        int num = 10;
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for(int i = 3; i <= num; i++) {
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }

}
