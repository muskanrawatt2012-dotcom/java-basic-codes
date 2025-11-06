package ExceptionHandlingAssignment.banktx;

public class BankTransactionManager {
    public static void verifyAccount(String accountNo) throws AccountNotFoundException {
        if (accountNo == null || !accountNo.equals("123456")) {
            throw new AccountNotFoundException("Account not found: " + accountNo);
        }
    }
    public static void processTransaction(int balance, int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds: " + balance);
        }
    }
    public static void executeTransaction(String accountNo, int balance, int amount) throws Exception {
        verifyAccount(accountNo);
        processTransaction(balance, amount);
        System.out.println("Transaction completed successfully.");
    }
    public static void main(String[] args) {
        try {
            executeTransaction("111111", 2000, 1000);
        } catch (AccountNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
        try {
            executeTransaction("123456", 500, 700);
        } catch (AccountNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
        try {
            executeTransaction("123456", 2000, 1000);
        } catch (AccountNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}
