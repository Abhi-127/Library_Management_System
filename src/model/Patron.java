package model;

import java.util.ArrayList;
import java.util.List;

public class Patron {

    private String id;
    private String name;
    private List<Loan> history = new ArrayList<>();

    public Patron(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }

    public List<Loan> getHistory() {
        return history;
    }

    public void addLoan(Loan loan) {
        history.add(loan);
    }
}