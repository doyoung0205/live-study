package com.company.week4;

public class BankAccount {

    public BankAccount() {

    }

    public BankAccount(String name) {
        this.name = name;
    }

    private int balance = 0;
    private String name;

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("잔액 : " + balance);
        return balance;
    }
}
