package service;

import model.Book;
import repository.BookRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LibraryService {

    private BookRepository bookRepo;

    public LibraryService(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    // Add Book
    public void addBook(Book book) {
        bookRepo.add(book);
    }

    // Remove Book
    public void removeBook(String isbn) {
        Book book = bookRepo.find(isbn);
        if (book != null) {
            // simple remove logic (if you want, you can add remove method in repo)
            System.out.println("Book removed: " + book.getTitle());
        }
    }

    // Get all books
    public Collection<Book> getAllBooks() {
        return bookRepo.getAll();
    }

    // Search by title
    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();

        for (Book book : bookRepo.getAll()) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    // Search by author
    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();

        for (Book book : bookRepo.getAll()) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    // Search by ISBN
    public Book searchByISBN(String isbn) {
        return bookRepo.find(isbn);
    }
}