package com.careerit.cj.day8;

public class Account {

    private int accNumber;
    private String name;
    private double balance;

    public Account(int accNumber, String name, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount " + amount + " is debited from your account; balance is :" + balance);
        }
        throw new IllegalArgumentException("Sorry! Insufficient funds, your balance is :" + balance + " and you are trying to withdraw :" + amount);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " is credited to your account; balance is :" + balance);
    }

    public void showInfo() {
        System.out.println("Account number :" + accNumber);
        System.out.println("Name           :" + name);
        System.out.println("Balance        :" + balance);
    }
}
