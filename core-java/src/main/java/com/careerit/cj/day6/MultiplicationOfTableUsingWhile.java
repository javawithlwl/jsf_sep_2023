package com.careerit.cj.day6;

import java.util.Scanner;

public class MultiplicationOfTableUsingWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num :");
        int num = sc.nextInt();
        int i = 10;
        while (i >= 1) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i--;
        }
    }
}
