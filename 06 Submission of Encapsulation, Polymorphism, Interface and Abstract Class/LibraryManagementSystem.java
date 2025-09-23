interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    public abstract int getLoanDuration();
}

// Subclasses
class Book extends LibraryItem implements Reservable {
    public Book(int id, String title, String author) { super(id, title, author); }

    @Override public int getLoanDuration() { return 14; }
    @Override public void reserveItem() { System.out.println("Book reserved"); }
    @Override public boolean checkAvailability() { return true; }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(int id, String title, String author) { super(id, title, author); }

    @Override public int getLoanDuration() { return 7; }
    @Override public void reserveItem() { System.out.println("DVD reserved"); }
    @Override public boolean checkAvailability() { return false; }
}
