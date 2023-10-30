package com.careerit.cj.day6;

import java.util.Scanner;

public class SumOfDigitsOfGivenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num :");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            sum += temp % 10;;
            temp /= 10;
        }
        System.out.println("Sum of digits of " + num + " number is : " + sum);
    }
}
