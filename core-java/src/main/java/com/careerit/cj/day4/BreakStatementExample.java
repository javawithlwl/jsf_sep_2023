package com.careerit.cj.day4;

public class BreakStatementExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) {
                continue;
            }
            if(i % 6 == 0){
                break;
            }
            System.out.println(i);
        }
    }
}
