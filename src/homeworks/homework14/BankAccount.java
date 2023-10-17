package homeworks.homework14;

import java.io.IOException;

class BankAccountException extends IOException {
    public BankAccountException() {
        super("Ошибка: Недостаточно средств на счету.");
    }
}

class NegativeBalanceException extends IOException {
    public NegativeBalanceException() {
        super("Ошибка: Отрицательный баланс не допускается.");
    }
}

public class BankAccount {

    private String accountName;
    private double balance;

    public BankAccount(String accountName, double firstBalance) {
        this.accountName = accountName;
        this.balance = firstBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws BankAccountException, NegativeBalanceException {
        if (amount < 0) {
            throw new NegativeBalanceException();
        }
        if (balance - amount < 0) {
            throw new BankAccountException();
        }
        balance -= amount;
    }

    public void transferTo(BankAccount recipient, double amount) throws BankAccountException, NegativeBalanceException {
        withdraw(amount);
        recipient.deposit(amount);
    }
}