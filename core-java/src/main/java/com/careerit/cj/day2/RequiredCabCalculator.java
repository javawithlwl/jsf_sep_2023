package com.careerit.cj.day2;

import java.util.Scanner;

public class RequiredCabCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the people count : ");
        int peopleCount = sc.nextInt();
        System.out.println("Enter the cab capacity : ");
        int cabCapacity = sc.nextInt();
        int requiredCabs = peopleCount / cabCapacity;
        if (peopleCount % cabCapacity != 0) {
            requiredCabs += 1;
        }
        System.out.println("To transport " + peopleCount + " people, with cab capacity " + cabCapacity + " required " + requiredCabs + " cabs");
    }
}
