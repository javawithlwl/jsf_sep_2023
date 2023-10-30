package com.careerit.cj.day19;

public class SavingsAccount extends Account {

    private final double minBalance;

    public SavingsAccount(String accNumber, String name, double balance, double minBalance) {
        super(accNumber, name, balance);
        this.minBalance = minBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= (balance - minBalance)) {
            balance -= amount;
            System.out.println("Amount " + amount + " is debited from your account and your current balance is " + balance);
        } else {
            System.out.println("Sorry! Insufficient funds");
        }
    }
}