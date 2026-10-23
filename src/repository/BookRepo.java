package repository;

import model.Book;
import java.util.*;

public class BookRepo implements BookRepository {

    private Map<String, Book> books = new HashMap<>();

    public void add(Book book) {
        books.put(book.getISBN(), book);
    }

    public Book find(String isbn) {
        return books.get(isbn);
    }

    public Collection<Book> getAll() {
        return books.values();
    }
}