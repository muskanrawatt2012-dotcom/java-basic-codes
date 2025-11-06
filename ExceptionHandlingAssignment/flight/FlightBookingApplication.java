package ExceptionHandlingAssignment.flight;

import java.util.Random;

public class FlightBookingApplication {
    public static void checkSeatAvailability() throws SeatUnavailableException {
        if (new Random().nextInt(2) == 0) {
            throw new SeatUnavailableException("No seats available.");
        }
    }
    public static void processPayment() throws PaymentFailedException {
        if (new Random().nextInt(2) == 0) {
            throw new PaymentFailedException("Payment failed.");
        }
    }
    public static void bookTicket() throws Exception {
        checkSeatAvailability();
        processPayment();
        System.out.println("Ticket booked successfully.");
    }
    public static void main(String[] args) {
        try {
            bookTicket();
        } catch (SeatUnavailableException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}
