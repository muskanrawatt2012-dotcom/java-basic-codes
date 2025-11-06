package ExceptionHandlingAssignment.order;

import java.util.Random;

public class OnlineOrderProcessing {
    public static void placeOrder() throws OutOfStockException, PaymentFailedException {
        int r = new Random().nextInt(3);
        if (r == 0) throw new OutOfStockException("Product is out of stock.");
        if (r == 1) throw new PaymentFailedException("Payment failed.");
        System.out.println("Order placed successfully!");
    }

    public static void main(String[] args) {
        try {
            placeOrder();
        } catch (OutOfStockException e) {
            System.out.println("Order failed: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Order failed: " + e.getMessage());
        }
    }
}
