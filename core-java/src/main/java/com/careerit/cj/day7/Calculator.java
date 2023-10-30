package com.careerit.cj.day7;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the num1 :");
            int num1 = sc.nextInt();
            System.out.println("Enter the num2 :");
            int num2 = sc.nextInt();
            System.out.println("Enter the operator (+,-,*,/,%) :");
            char operator = sc.next().charAt(0);

            switch (operator) {
                case '+' -> System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                case '-' -> System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                case '*' -> System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                case '/' -> System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                case '%' -> System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                default -> System.out.println("Invalid operator");
            }
            System.out.println("Do you want to continue (yes/no) :");
            String choice = sc.next();
            if(choice.equals("no")){
                break;
            }

        }
    }

}
