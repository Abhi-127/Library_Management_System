package repository;



import model.Book;
import java.util.Collection;

public interface BookRepository {
    void add(Book book);
    Book find(String isbn);
    Collection<Book> getAll();
}