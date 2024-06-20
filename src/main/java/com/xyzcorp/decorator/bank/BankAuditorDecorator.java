package com.xyzcorp.decorator.bank;

public class BankAuditorDecorator implements Bank {

    private final Bank original;

    public BankAuditorDecorator(Bank original) {
        this.original = original;
    }

    @Override
    public void deposit(int amount) {
        System.out.format("Auditing amount doing a deposit of %d", amount);
        original.deposit(100);
    }

    public static void main(String[] args) {
        BasicBank bank = new BasicBank();
        BankAuditorDecorator decorator = new BankAuditorDecorator(bank);
        decorator.deposit(100);
    }
}
