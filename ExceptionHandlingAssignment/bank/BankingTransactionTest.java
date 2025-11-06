package ExceptionHandlingAssignment.bank;

public class BankingTransactionTest {
    public static void main(String[] args) {
        Transaction tx = new Transaction(5000);
        try {
            tx.execute(6000);
        } catch (NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
