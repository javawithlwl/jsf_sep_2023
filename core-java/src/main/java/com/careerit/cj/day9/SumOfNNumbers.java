package com.careerit.cj.day9;

import java.util.Scanner;

public class SumOfNNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N value :");
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter the " + (i + 1) + " element :");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        double avg = 0;
        for (int num: arr) {
            sum += num;
        }
        avg = sum / (double) arr.length;
        System.out.println("Sum of " + N + " numbers is :" + sum);
        System.out.println("Avg of " + N + " numbers is :" + avg);
        sc.close();


    }
}
