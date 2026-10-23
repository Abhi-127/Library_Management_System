package util;

import model.*;
import repository.*;
import service.*;
import strategy.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        BookRepository bookRepo = new BookRepo();
        PatronRepo patronRepo = new PatronRepo();
        LoanRepo loanRepo = new LoanRepo();

        LendingService lending = new LendingService(bookRepo, patronRepo, loanRepo);

        Book b1 = new Book("1", "Java", "James", 2000);
        Book b2 = new Book("2", "Spring", "James", 2005);

        bookRepo.add(b1);
        bookRepo.add(b2);

        Patron p = new Patron("P1", "Rachit");
        patronRepo.add(p);

        lending.borrow("1", "P1");
        lending.returnBook("1");

        RecommendationService rec =
                new RecommendationService(new AuthorStrategy());

        List<Book> list = new ArrayList<>(bookRepo.getAll());

        rec.recommend(p, list).forEach(b -> System.out.println(b.getTitle()));
    }
}