package ExceptionHandlingAssignment.vehicle;

public class InvalidMileageException extends Exception {
    public InvalidMileageException(String message) {
        super(message);
    }
}
