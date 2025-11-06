package ExceptionHandlingAssignment.review;

public class ProductReviewSystem {
    public static void submitReview(int rating, String comment) throws InvalidRatingException, EmptyReviewException {
        if (rating < 1 || rating > 5) {
            throw new InvalidRatingException("Invalid rating: " + rating);
        }
        if (comment == null || comment.trim().isEmpty()) {
            throw new EmptyReviewException("Review cannot be empty");
        }
        System.out.println("Review submitted: " + rating + " stars, comment: " + comment);
    }

    public static void main(String[] args) {
        try {
            submitReview(0, "Great product");
        } catch (InvalidRatingException e) {
            System.out.println("Review error: " + e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println("Review error: " + e.getMessage());
        }
        try {
            submitReview(4, "");
        } catch (InvalidRatingException e) {
            System.out.println("Review error: " + e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println("Review error: " + e.getMessage());
        }
        try {
            submitReview(5, "Excellent!");
        } catch (InvalidRatingException e) {
            System.out.println("Review error: " + e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println("Review error: " + e.getMessage());
        }
    }
}
