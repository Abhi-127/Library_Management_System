package service;

import model.*;
import strategy.RecommendationStrategy;
import java.util.List;

public class RecommendationService {

    private RecommendationStrategy strategy;

    public RecommendationService(RecommendationStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Book> recommend(Patron p, List<Book> books) {
        return strategy.recommend(p, books);
    }
}