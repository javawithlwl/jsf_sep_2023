package com.careerit.cj.day3;

import java.util.Scanner;

public class CalculateGrade {

    /*
        1 - 5 => C
        6 - 8 => B
        9 - 10 => A
        otherwise => F

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks :");
        int marks = sc.nextInt();
        String grade = "F";
        if(marks >= 1 && marks <= 5) {
            grade = "C";
        }else if(marks >= 6 && marks <= 8) {
            grade = "B";
        }else if(marks >= 9 && marks <= 10) {
            grade = "A";
        }else{
            grade = "F";
        }
        System.out.println("Grade for the marks "+marks+" is "+grade);
    }
}
