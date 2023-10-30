package com.careerit.cj.day5;

public class GeneratePrimeInRange {

    public static void main(String[] args) {
        int lb = 1;
        int ub = 50;
        for (int num = lb; num <= ub; num++) {
            if(isPrime(num)){
                System.out.print(num+" ");
            }
        }
    }
    public static boolean isPrime(int num){
        if(num < 2 || (num % 2 == 0 && num != 2)){
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
               return false;
            }
        }
        return true;
    }
}
