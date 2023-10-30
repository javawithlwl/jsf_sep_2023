package com.careerit.cj.day6;

public class ArmstrongNumber {

    // Armstrong number is a number which is equal to the sum of cubes of its digits

    // 153 = 1^3 + 5^3 + 3^3
    // 371 = 3^3 + 7^3 + 1^3
    // 1634 = 1^4 + 6^4 + 3^4 + 4^4


    public static void main(String[] args) {
        int count = 0;
        for (int num = 1; num <= Integer.MAX_VALUE; num++) {
            if (isArmstrong(num)) {
                System.out.println(num + " ");
                count++;
            }
            if(count == 15){
                break;
            }
        }
    }

    private static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
    public static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum += Math.pow(r, countDigits(num));
            temp /= 10;
        }
        return sum == num;
    }

}
