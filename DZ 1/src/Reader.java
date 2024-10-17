import java.util.ArrayList;
import java.util.List;
public class Reader {

    private String name;
    private int readerid;
    public List<Book> borrowedBooks;

    public Reader(String name, int Id) {
        this.name = name;
        this.readerid = readerid;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }


}
