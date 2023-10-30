package com.careerit.cj.day3;

import java.util.Scanner;

public class SimpleIfToCheckNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if(num < 0){
            num = -num;
        }
        System.out.println("Entered number is :"+num);
    }
}
