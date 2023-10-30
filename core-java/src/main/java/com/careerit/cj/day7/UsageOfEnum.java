package com.careerit.cj.day7;

import java.util.Scanner;

public class UsageOfEnum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount :");
        double billAmount = sc.nextDouble();
        System.out.println("Enter the day (MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY) :");
        String day = sc.next().toUpperCase();
        double discountAmount = getDiscountAmount(billAmount, Day.valueOf(day));
        System.out.println("Discount amount for bill amount " + billAmount + " is " + discountAmount);
    }


    public static double getDiscountAmount(double billAmount, Day day) {
        // Mon,Tue,Wed,Thu - 20% discount
        // Fri,Sat - 10% discount
        // Sun - 5% discount
        return switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> billAmount * 0.2;
            case FRIDAY, SATURDAY -> billAmount * 0.1;
            case SUNDAY -> billAmount * 0.05;
        };
    }
}
