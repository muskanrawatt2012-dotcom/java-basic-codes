package ExceptionHandlingAssignment.review;

public class EmptyReviewException extends Exception {
    public EmptyReviewException(String message) {
        super(message);
    }
}
