package ExceptionHandlingAssignment.library;

import java.util.*;

public class LibraryManagementSystem {
    private Map<String, Boolean> bookAvailable = new HashMap<>();
    private Map<String, Set<String>> userToBorrowed = new HashMap<>();

    public LibraryManagementSystem() {
        bookAvailable.put("Clean Code", true);
        bookAvailable.put("Effective Java", true);
        bookAvailable.put("Design Patterns", false);
    }

    public void borrow(String user, String book) throws BookNotAvailableException, UserLimitExceededException {
        userToBorrowed.putIfAbsent(user, new HashSet<>());
        Set<String> borrowed = userToBorrowed.get(user);
        if (borrowed.size() >= 5) throw new UserLimitExceededException("User limit exceeded (max 5).");
        if (!bookAvailable.getOrDefault(book, false)) throw new BookNotAvailableException("Book not available: " + book);
        borrowed.add(book);
        bookAvailable.put(book, false);
        System.out.println(user + " successfully borrowed " + book);
    }

    public void returnBook(String user, String book) throws InvalidReturnException {
        Set<String> borrowed = userToBorrowed.getOrDefault(user, new HashSet<>());
        if (!borrowed.contains(book)) throw new InvalidReturnException("Book not borrowed: " + book);
        borrowed.remove(book);
        bookAvailable.put(book, true);
        System.out.println(user + " successfully returned " + book);
    }

    public static void main(String[] args) {
        LibraryManagementSystem lib = new LibraryManagementSystem();
        try {
            lib.borrow("Rahul", "Effective Java");
            lib.borrow("Rahul", "Design Patterns");
        } catch (BookNotAvailableException | UserLimitExceededException e) {
            System.out.println("Library error: " + e.getMessage());
        }
        try {
            lib.returnBook("Rahul", "Clean Code");
        } catch (InvalidReturnException e) {
            System.out.println("Library error: " + e.getMessage());
        }
    }
}
