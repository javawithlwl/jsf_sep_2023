package com.careerit.cj.day6;

import java.util.Scanner;

public class ReverseOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num :");
        int num = sc.nextInt();
        int rev = reverse(num);
        System.out.println("Reverse of "+num+" is "+rev);
        if(isPalindrome(num)) {
            System.out.println(num + " is palindrome");
        }else {
            System.out.println(num + " is not palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
    public static int reverse(int number){
        int rev = 0;
        while (number != 0) {
            int r = number % 10;
            rev = rev * 10 + r;
            number /= 10;
        }
        return rev;
    }

}
