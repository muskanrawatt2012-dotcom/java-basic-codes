interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (amount <= balance) balance -= amount; }
    public double getBalance() { return balance; }

    public abstract double calculateInterest();
}

// Subclasses
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int acc, String name, double bal) { super(acc, name, bal); }

    @Override public double calculateInterest() { return getBalance() * 0.04; }
    @Override public void applyForLoan(double amount) { System.out.println("Loan request: " + amount); }
    @Override public boolean calculateLoanEligibility() { return getBalance() > 5000; }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(int acc, String name, double bal) { super(acc, name, bal); }

    @Override public double calculateInterest() { return getBalance() * 0.02; }
}
