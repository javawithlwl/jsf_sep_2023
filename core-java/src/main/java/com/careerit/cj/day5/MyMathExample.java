package com.careerit.cj.day5;

public class MyMathExample {


    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int biggest(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
        // ternary operator
        // (exp) ? true value : false value
    }

    public static int biggest(int num1, int num2, int num3) {
        return (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;
    }

    public static int pow(int m, int n) {
        // 2, 3 => 2 * 2 * 2 => 8
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= m;
        }
        return res;
    }
}
