package com.careerit.cj.day9;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class FindBiggestOfNNumbers {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(10, 100);
        }
        int max = biggest(arr);
        int min = smallest(arr);
        int sum = sumOfElements(arr);
        System.out.println("Biggest of "+Arrays.toString(arr)+" is :"+max);
        System.out.println("Smallest of "+Arrays.toString(arr)+" is :"+min);
        System.out.println("Sum of "+Arrays.toString(arr)+" is :"+sum);

    }

    private static int evenCount(int[] numArr) {
        // TODO : Write logic to return the count of even numbers in the given array
        return 0;
    }
    private static int oddCount(int[] numArr) {
        // TODO : Write logic to return the count of odd numbers in the given array
        return 0;
    }
    private static int[] perfectCount(int[] numArr) {
        // TODO : Write logic to return the count of perfect numbers in the given array
        // Note: Perfect number is a number whose sum of factors is equal to the number itself
        // Example: 6 is a perfect number because 1 + 2 + 3 = 6

        return null;
    }

    private static int primeCount(int[] numArr) {
       // TODO : Write logic to return the count of prime numbers in the given array
        return 0;
    }
    private static int sumOfElements(int[] numArr) {
        int sum = 0;
        for(int num: numArr) {
            sum += num;
        }
        return sum;
    }
    private static int smallest(int[] numArr) {
        int min = numArr[0];
        for(int i = 1; i < numArr.length; i++) {
            if(numArr[i] < min){
                min = numArr[i];
            }
        }
        return min;
    }
    private static int biggest(int[] numArr){
        int max = numArr[0];
        for(int i = 1; i < numArr.length; i++) {
            if(numArr[i] > max){
                max = numArr[i];
            }
        }
        return max;
    }
}
