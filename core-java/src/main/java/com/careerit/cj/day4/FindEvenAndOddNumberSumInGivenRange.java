package com.careerit.cj.day4;

import java.util.Scanner;

public class FindEvenAndOddNumberSumInGivenRange {

    // lb = 10, ub = 20
    // Even num sum:
    // Odd num sum:

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lb value :");
        int lb = sc.nextInt();
        System.out.println("Enter the ub value :");
        int ub = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = lb; i <= ub; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Even sum :"+evenSum);
        System.out.println("Odd sum :"+oddSum);
    }

}
