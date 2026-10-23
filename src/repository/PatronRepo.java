package repository;

import model.Patron;
import java.util.*;

public class PatronRepo {

    private Map<String, Patron> patrons = new HashMap<>();

    public void add(Patron p) {
        patrons.put(p.getId(), p);
    }

    public Patron find(String id) {
        return patrons.get(id);
    }
}