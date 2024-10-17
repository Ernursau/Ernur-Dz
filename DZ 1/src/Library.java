import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        books = new ArrayList<>();
        readers = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Dobav Knigu: " + book);
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println( book);
        } else {
            System.out.println("Eror");
        }
    }

    public void registerReader(Reader reader) {
        readers.add(reader);
        System.out.println("Regitratsia: " + reader);
    }

    public void issueBook(Reader reader, Book book) {
        if (books.contains(book) && book.getKolichestvo() > 0) {
            book.setKolichestvo(book.getKolichestvo() - 1);
            reader.borrowBook(book);
            System.out.println("Kniga'" + book.getNazvanie() + "' Vidina " + reader.getName() + ".");
        } else {
            System.out.println("Kniga '" + book.getNazvanie() + "' ne dostupno.");
        }
    }
    public void returnBook(Reader reader, Book book) {
        if (reader.borrowedBooks.contains(book)) {
            book.setKolichestvo(book.getKolichestvo() + 1);
            reader.returnBook(book);
            System.out.println("Kniga'" + book.getNazvanie() + "' Vozvrat " + reader.getName() + ".");
        } else {
            System.out.println(reader.getName() + " eror '" + book.getNazvanie());
        }
    }


}
