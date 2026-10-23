package model;

import java.time.LocalDate;

public class Loan {

    private String loanId;
    private Book book;
    private Patron patron;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Loan(String loanId, Book book, Patron patron) {
        this.loanId = loanId;
        this.book = book;
        this.patron = patron;
        this.borrowDate = LocalDate.now();
    }

    public String getLoanId() { return loanId; }
    public Book getBook() { return book; }
    public Patron getPatron() { return patron; }

    public void markAsReturned() {
        this.returnDate = LocalDate.now();
    }

    public boolean isReturned() {
        return returnDate != null;
    }
}