package ExceptionHandlingAssignment.review;

public class InvalidRatingException extends Exception {
    public InvalidRatingException(String message) {
        super(message);
    }
}
