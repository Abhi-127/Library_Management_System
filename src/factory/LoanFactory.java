package factory;


import model.*;
import java.util.UUID;

public class LoanFactory {

    public static Loan create(Book book, Patron patron) {
        return new Loan(UUID.randomUUID().toString(), book, patron);
    }
}