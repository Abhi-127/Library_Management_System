package model;

public class Book {

    private final String ISBN;
    private String title;
    private String author;
    private int publicationYear;
    private boolean available;

    public Book(String ISBN, String title, String author, int publicationYear) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = true;
    }

    public String getISBN() { return ISBN; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }
    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}