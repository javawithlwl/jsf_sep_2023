package com.careerit.cj.day5;

public class SumOfSeries {

    public static void main(String[] args) {
        int n = 5;
        double res = 1;
        for (int i = 2; i <= n; i++) {
            res += (1 / (double) factorial(i));
        }
        System.out.println(res);
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

}


