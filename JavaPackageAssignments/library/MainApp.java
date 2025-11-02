import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class MainApp {
    public static void main(String[] args) {
        Book book = new Book();
        Member member = new Member();
        Transaction transaction = new Transaction();

        book.addBook();
        member.register();
        transaction.issueBook();
    }
}
