package com.careerit.cj.day5;

public class BreakAndContinueExample {

    public static void main(String[] args) {

        // 1 1
        // 1 2
        // 1 4
        // 1 5
        // 1 7
        // 1 8
        // 1 10

        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 3 == 0){
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }

    }
}
