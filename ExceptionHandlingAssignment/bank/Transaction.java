package ExceptionHandlingAssignment.bank;

import java.util.Random;

public class Transaction {
    private int balance;
    public Transaction(int initial) {
        this.balance = initial;
    }
    public void execute(int amount) throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
        if (amount < 0) throw new NegativeAmountException("Negative amount: " + amount);
        if (amount > balance) throw new InsufficientFundsException("Insufficient balance: " + balance);
        if (new Random().nextInt(3) == 2) throw new NetworkFailureException("Network issue occurred.");
        balance -= amount;
        System.out.println("Transaction success. New balance: " + balance);
    }
}
