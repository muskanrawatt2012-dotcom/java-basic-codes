import java.util.*;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class Library {
    private String name;
    private List<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book); // Aggregation: Library has books, but books exist independently
    }

    public void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) b.display();
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("Clean Code", "Robert C. Martin");

        Library lib1 = new Library("City Library");
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib1.showBooks();
    }
}
