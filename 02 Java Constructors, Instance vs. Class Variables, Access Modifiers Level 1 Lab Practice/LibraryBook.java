class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully: " + title);
        } else {
            System.out.println("Sorry, " + title + " is not available.");
        }
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }

    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("Java Basics", "James Gosling", 500, true);
        lb.displayDetails();
        lb.borrowBook();
        lb.displayDetails();
    }
}
