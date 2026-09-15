
import java.util.Scanner;

class Account {
    int balance = 5000;

    void deposit(int amount) throws InvalidAmountException {
        if (amount <= 0)
            throw new InvalidAmountException("Invalid amount");
        balance += amount;
        System.out.println("Balance: " + balance);
    }

    void withdraw(int amount)
            throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0)
            throw new InvalidAmountException("Invalid amount");

        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient balance");

        balance -= amount;
        System.out.println("Balance: " + balance);
    }
}

public class problem5 {

    static Account a = new Account();

    static void deposit(int acc, int amount)
            throws AccountNotFoundException, InvalidAmountException {
        if (acc != 101)
            throw new AccountNotFoundException("Account not found");
        a.deposit(amount);
    }

    static void withdraw(int acc, int amount)
            throws AccountNotFoundException, InvalidAmountException,
            InsufficientBalanceException {
        if (acc != 101)
            throw new AccountNotFoundException("Account not found");
        a.withdraw(amount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Account number: ");
            int acc = sc.nextInt();

            System.out.print("1. Withdraw  2. Deposit: ");
            int choice = sc.nextInt();

            System.out.print("Amount: ");
            int amount = sc.nextInt();

            if (choice == 1)
                withdraw(acc, amount);
            else
                deposit(acc, amount);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String s) {
        super(s);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String s) {
        super(s);
    }
}

class AccountNotFoundException extends Exception {
    AccountNotFoundException(String s) {
        super(s);
    }
}
