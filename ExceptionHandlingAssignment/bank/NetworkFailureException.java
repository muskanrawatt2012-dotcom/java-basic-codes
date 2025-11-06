package ExceptionHandlingAssignment.bank;

public class NetworkFailureException extends Exception {
    public NetworkFailureException(String message) {
        super(message);
    }
}
