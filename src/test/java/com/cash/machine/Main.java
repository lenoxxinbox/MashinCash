package com.cash.machine;

public class Main {
    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(20, 20, 20);
        cashMachine.toDepositAmount(3, 2, 1);
        cashMachine.to_withdraw(1000);
        cashMachine.to_withdraw(103);
        cashMachine.to_withdraw(5000000);
    }
}
