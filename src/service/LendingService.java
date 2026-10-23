package service;

import factory.LoanFactory;
import model.*;
import repository.*;

public class LendingService {

    private BookRepository bookRepo;
    private PatronRepo patronRepo;
    private LoanRepo loanRepo;

    public LendingService(BookRepository b, PatronRepo p, LoanRepo l) {
        this.bookRepo = b;
        this.patronRepo = p;
        this.loanRepo = l;
    }

    public void borrow(String isbn, String pid) {

        Book book = bookRepo.find(isbn);
        Patron patron = patronRepo.find(pid);

        if (book == null || patron == null || !book.isAvailable()) {
            System.out.println("Cannot borrow");
            return;
        }

        Loan loan = LoanFactory.create(book, patron);

        loanRepo.save(loan);
        book.setAvailable(false);
        patron.addLoan(loan);

        System.out.println("Borrowed");
    }

    public void returnBook(String isbn) {

        Loan loan = loanRepo.findActive(isbn);

        if (loan == null) {
            System.out.println("No loan found");
            return;
        }

        loan.markAsReturned();
        loan.getBook().setAvailable(true);

        System.out.println("Returned");
    }
}