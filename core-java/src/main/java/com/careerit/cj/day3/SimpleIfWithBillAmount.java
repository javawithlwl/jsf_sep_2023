package com.careerit.cj.day3;

import java.util.Scanner;

public class SimpleIfWithBillAmount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount :");
        double billAmount = sc.nextDouble();

        double discount = 0;
        if(billAmount >= 1000){
            discount = billAmount * (10 / (double)100);
        }
        double netAmount = billAmount - discount;
        System.out.println("Bill Amount :"+billAmount);
        System.out.println("Discount    :"+discount);
        System.out.println("Net Amount  :"+netAmount);
    }
}
