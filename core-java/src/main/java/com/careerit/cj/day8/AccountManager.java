package com.careerit.cj.day8;

public class AccountManager {

    public static void main(String[] args) {

        Account acc1 = new Account(1001,"Krish",5000);
        Account acc2 = new Account(1002,"Manoj",6000);
        Account acc3 = new Account(1003,"Charan",7000);
        acc1.showInfo();
        acc2.showInfo();
        acc3.showInfo();
        System.out.println(acc1 == acc2);
        System.out.println(acc2 == acc3);
        System.out.println(acc1 == acc3);

    }
}
