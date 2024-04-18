package com.cash.machine;

public class CashMachine {
    int banknoteValue20;
    int banknoteValue50;
    int banknoteValue100;

    public CashMachine(int banknoteValue20, int banknoteValue50, int banknoteValue100) {
        this.banknoteValue20 = banknoteValue20;
        this.banknoteValue50 = banknoteValue50;
        this.banknoteValue100 = banknoteValue100;
    }

    public void toDepositAmount(int value20, int value50, int value100) {
        banknoteValue20 += value20;
        banknoteValue50 += value50;
        banknoteValue100 += value100;
        int sum = (value20 * 20) + (value50 * 50) + (value100 * 100);
        int sumAll = (banknoteValue20 * 20) + (banknoteValue50 * 50) + (banknoteValue100 * 100);
        System.out.println("На счет внесено: " + sum);
        System.out.println("Остаток в банкомате после внесения: " + sumAll);
    }

    public boolean to_withdraw(int sum) {
        int sumAll = (banknoteValue20 * 20) + (banknoteValue50 * 50) + (banknoteValue100 * 100);
        System.out.println("Остаток в банкомате до снятия: " + sumAll);
        if (sumAll < sum) {
            System.out.println("Недостаточно средств, снимите сумму до " + sumAll);
            return false;
        } else {
            int remains = sum;
            int hundreds = sum / 100;
            remains -= hundreds * 100;
            int fifties = remains / 50;
            remains -= fifties * 50;
            int twenties = remains / 20;
            remains -= twenties * 20;

            if (remains == 0) {
                System.out.println("Выдана сумма: " + sum + ", следующими купюрами:\n по 100: " + hundreds + "\n по 50: " + fifties + "\n по 20: " + twenties);
                System.out.println("Остаток в банкомате после снятия: " + (sumAll - sum));
                return true;
            } else {
                System.out.println("Введите сумму кратную 20");
                return false;
            }
        }
    }
}
