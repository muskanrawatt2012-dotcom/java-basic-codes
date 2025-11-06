package ExceptionHandlingAssignment.movie;

import java.util.HashMap;
import java.util.Map;

public class MovieTicketBooking {
    private Map<Integer, Boolean> seats = new HashMap<>();

    public MovieTicketBooking(int totalSeats) {
        for (int i = 1; i <= totalSeats; i++) {
            seats.put(i, false);
        }
    }

    public void bookSeat(int seatNo) throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seatNo)) {
            throw new InvalidSeatException("Invalid seat number: " + seatNo);
        }
        if (seats.get(seatNo)) {
            throw new SeatAlreadyBookedException("Seat already booked: " + seatNo);
        }
        seats.put(seatNo, true);
        System.out.println("Seat booked successfully: " + seatNo);
    }

    public static void main(String[] args) {
        MovieTicketBooking booking = new MovieTicketBooking(5);
        try {
            booking.bookSeat(3);
            booking.bookSeat(3);
        } catch (InvalidSeatException e) {
            System.out.println("Booking error: " + e.getMessage());
        } catch (SeatAlreadyBookedException e) {
            System.out.println("Booking error: " + e.getMessage());
        }
        try {
            booking.bookSeat(6);
        } catch (InvalidSeatException e) {
            System.out.println("Booking error: " + e.getMessage());
        } catch (SeatAlreadyBookedException e) {
            System.out.println("Booking error: " + e.getMessage());
        }
    }
}
