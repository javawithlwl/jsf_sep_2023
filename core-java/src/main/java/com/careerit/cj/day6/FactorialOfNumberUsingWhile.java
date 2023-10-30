package com.careerit.cj.day6;

import java.util.Scanner;

public class FactorialOfNumberUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num :");
        int num = sc.nextInt();

        // 5! = 5 * 4 * 3 * 2 * 1 = 120
        // 5! = 1 * 2 * 3 * 4 * 5 = 120

        int i = 2;
        int res = 1;
        while(i <= num) {
            res *=  i;
            i++;
        }
        System.out.println("Factorial of "+num+" is "+res);

    }
}
