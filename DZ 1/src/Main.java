public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Abai Zholi", "Muhtar Auezov ", "1234", 11);
        Book book2 = new Book("Voina i Mir", "Lev Tolstoi", "1324", 10);


        Library library = new Library();


        library.addBook(book1);
        library.addBook(book2);


        Reader reader1 = new Reader("Ernur",1);
        library.registerReader(reader1);


        library.issueBook(reader1, book1);


        library.returnBook(reader1, book1);
    }
}