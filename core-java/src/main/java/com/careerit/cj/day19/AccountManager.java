package com.careerit.cj.day19;

import java.util.Scanner;

public class AccountManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AccountService accountService = new AccountService();
        while (true) {
            System.out.println("------------Bank Application-----------");
            System.out.println("1.Create Account");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposit");
            System.out.println("4.Show Info");
            System.out.println("5.Delete Account");
            System.out.println("6.Update Name");
            System.out.println("7.Show all accounts");
            System.out.println("8.Exit");
            System.out.println("---------------------------------------");
            System.out.println("Enter your choice :");
            int ch = sc.nextInt();
            String accNumber;
            String name;
            switch (ch) {
                case 1:
                    System.out.println("Enter the account type 1.Savings 2.Current :");
                    int op = sc.nextInt();
                    Account acc = null;

                    if (op == 1) {
                        System.out.println("Enter the account number :");
                        accNumber = sc.next();
                        System.out.println("Enter the name :");
                        name = sc.next();
                        System.out.println("Enter the balance :");
                        double balance = sc.nextDouble();
                        System.out.println("Enter the minbalance :");
                        double minBalance = sc.nextDouble();
                        acc = new SavingsAccount(accNumber, name, balance, minBalance);
                        accountService.addAccount(acc);
                    } else if (op == 2) {
                        System.out.println("Enter the account number :");
                        accNumber = sc.next();
                        System.out.println("Enter the name :");
                        name = sc.next();
                        System.out.println("Enter the balance :");
                        double balance = sc.nextDouble();
                        System.out.println("Enter the overdraft :");
                        double overDraft = sc.nextDouble();
                        acc = new CurrentAccount(accNumber, name, balance, overDraft);
                        accountService.addAccount(acc);
                    } else {
                        System.out.println("Invalid option");
                    }

                    break;
                case 2:
                    System.out.println("Enter the account number :");
                    accNumber = sc.next();
                    System.out.println("Enter the amount to withdraw :");
                    double amount = sc.nextDouble();
                    accountService.withdrawAmount(accNumber, amount);
                    break;
                case 3:
                    System.out.println("Enter the account number :");
                    accNumber = sc.next();
                    System.out.println("Enter the amount to deposit :");
                    amount = sc.nextDouble();
                    accountService.depositAmount(accNumber, amount);
                    break;
                case 4:
                    System.out.println("Enter the account number :");
                    accNumber = sc.next();
                    accountService.showAccountInfo(accNumber);
                    break;
                case 5:
                    System.out.println("Enter the account number :");
                    accNumber = sc.next();
                    accountService.deleteAccount(accNumber);
                    break;
                case 6:
                    System.out.println("Enter the account number :");
                    accNumber = sc.next();
                    System.out.println("Enter the new name :");
                    name = sc.next();
                    accountService.updateNameAccount(accNumber, name);
                    break;
                case 7:
                    accountService.showAllAccounts();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
