package ExceptionHandlingAssignment.atm;

public class ATM {
    private int balance;

    public ATM(int initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Balance now: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}
