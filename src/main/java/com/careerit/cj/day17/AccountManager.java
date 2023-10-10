package com.careerit.cj.day17;

class Account {
    private long accNumber;
    private String name;
    private double balance;

    public Account(long accNumber, String name, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Your account is debited with :" + amount + " and your current balance is :" + balance);
        } else {
            System.out.println("Sorry! Insufficient funds");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Your account is credited with :" + amount + " and your current balance is :" + balance);
    }

    public void showInfo() {
        System.out.println("Account Number :" + accNumber);
        System.out.println("Name           :" + name);
        System.out.println("Balance        :" + balance);
    }
}

public class AccountManager {

    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Krish", 50000);
        acc1.showInfo();
        acc1.withdraw(10000);
        acc1.showInfo();
    }
}
