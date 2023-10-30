package com.careerit.cj.day2;

import java.util.Scanner;

public class SimpleInterestCalculator {
    // Simple Interest = (P * N * R)/100
    // P - Principal amount
    // N - Number of months
    // R - Rate of interest

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount :");
        double p = sc.nextDouble();
        System.out.println("Enter the number of months :");
        double n = sc.nextDouble();
        System.out.println("Enter the rate of interest :");
        double r = sc.nextDouble();
        double si = (p * n * r) / 100;
        System.out.println("Simple Interest : " + si);
    }


}
