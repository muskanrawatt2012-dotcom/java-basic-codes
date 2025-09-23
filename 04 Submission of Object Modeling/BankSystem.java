class Customer {
    private String name;
    private double balance;

    public Customer(String name) {
        this.name = name;
    }

    public void viewBalance() {
        System.out.println(name + "'s Balance: $" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public void openAccount(Customer customer, double initialDeposit) {
        System.out.println("Opening account for " + customer);
        customer.deposit(initialDeposit);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");
        Customer c1 = new Customer("Alice");

        bank.openAccount(c1, 500);
        c1.viewBalance();
    }
}
