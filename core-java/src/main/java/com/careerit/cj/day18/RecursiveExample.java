package com.careerit.cj.day18;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class RecursiveExample {

    public int gcd(int num1, int num2) {
        if (num1 == num2) {
            return num1;
        }
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }

    public int gcdWithRecursion(int num1, int num2) {
        if (num1 == num2) {
            return num1;
        }
        if (num1 > num2) {
            return gcdWithRecursion(num1 - num2, num2);
        } else {
            return gcdWithRecursion(num1, num2 - num1);
        }
    }
    public int factorial(int num){
        if(num == 1){
            return 1;
        }
        return num * factorial(num-1);
    }


    public static final void main(final String... args) {

    }
}
