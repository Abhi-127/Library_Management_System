package repository;

import model.Loan;
import java.util.*;

public class LoanRepo {

    private Map<String, Loan> loans = new HashMap<>();

    public void save(Loan loan) {
        loans.put(loan.getLoanId(), loan);
    }

    public Loan findActive(String isbn) {
        for (Loan l : loans.values()) {
            if (l.getBook().getISBN().equals(isbn) && !l.isReturned()) {
                return l;
            }
        }
        return null;
    }
}