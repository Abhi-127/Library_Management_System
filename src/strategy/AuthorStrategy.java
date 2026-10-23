package strategy;



import model.*;
import java.util.*;

public class AuthorStrategy implements RecommendationStrategy {

    public List<Book> recommend(Patron patron, List<Book> books) {

        List<Book> result = new ArrayList<>();

        for (Loan loan : patron.getHistory()) {
            String author = loan.getBook().getAuthor();

            for (Book b : books) {
                if (b.getAuthor().equals(author) && b.isAvailable()) {
                    result.add(b);
                }
            }
        }
        return result;
    }
}