package ExceptionHandlingAssignment.atm;

public class ATMTest {
    public static void main(String[] args) {
        ATM atm = new ATM(10000);
        try {
            atm.withdraw(15000);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            atm.withdraw(5000);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
