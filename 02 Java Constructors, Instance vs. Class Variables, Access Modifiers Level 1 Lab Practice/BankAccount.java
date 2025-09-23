class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displayDetails() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + getBalance() + ", Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, "Rohit", 50000, 5.0);
        sa.displayDetails();
    }
}
