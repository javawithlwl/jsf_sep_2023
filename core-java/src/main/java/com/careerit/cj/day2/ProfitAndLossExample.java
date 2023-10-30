package com.careerit.cj.day2;

import java.util.Scanner;

public class ProfitAndLossExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the buying price :");
        float buyingPrice = sc.nextFloat();
        System.out.println("Enter the selling price :");
        float sellingPrice = sc.nextFloat();

        if(sellingPrice > buyingPrice) {
            float profit = sellingPrice - buyingPrice;
            System.out.println("You got profit of :" + profit);
        }else if(sellingPrice < buyingPrice) {
            float loss = buyingPrice - sellingPrice;
            System.out.println("You got loss of :" + loss);
        }else {
            System.out.println("No profit no loss");
        }
    }
}
