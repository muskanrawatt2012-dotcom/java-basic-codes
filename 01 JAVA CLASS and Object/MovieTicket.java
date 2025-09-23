class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void bookTicket() {
        System.out.println("Ticket booked successfully!");
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket("Pathaan", 12, 250);
        t.bookTicket();
        t.displayTicket();
    }
}
