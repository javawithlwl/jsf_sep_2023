package com.careerit.cj.day2;

import java.util.Scanner;

public class SumAndAverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1 :");
        int num1 = scanner.nextInt();
        System.out.println("Enter the num2 :");
        int num2 = scanner.nextInt();
        System.out.println("Enter the num3 :");
        int num3 = scanner.nextInt();
        int sum = num1 + num2 + num3;
        double avg = sum / 3.0;
        System.out.println("The sum of     " + num1 + "," + num2 + " and " + num3 + " is " + sum);
        System.out.println("The average of " + num1 + "," + num2 + " and " + num3 + " is " + avg);
    }
}
