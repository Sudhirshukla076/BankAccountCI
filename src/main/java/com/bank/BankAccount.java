
package com.bank;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method 1: Deposit money
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    // Method 2: Withdraw money
    public double withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
        return balance;
    }

    // Method 3: Check current balance
    public double getBalance() {
        return balance;
    }
}