package com.careerit.cj.day4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {

    public static void main(String[] args) {

        int num = ThreadLocalRandom.current().nextInt(1, 7);
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Guess the number (1-6)");
            int guessedNum = sc.nextInt();
            if (num == guessedNum) {
                System.out.println("You won the game");
                break;
            } else if(i < 3){
                System.out.println("Guess is wrong, try again");
            }else{
                System.out.println("You reached max attempts, better luck next time; the number is "+num);
            }
        }
    }
}
