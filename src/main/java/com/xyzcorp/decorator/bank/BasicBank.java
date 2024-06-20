package com.xyzcorp.decorator.bank;

public class BasicBank implements Bank {
    private int balance;

    @Override
    public void deposit(int amount) {
        balance += amount;
    }
}
