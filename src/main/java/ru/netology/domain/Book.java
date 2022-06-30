package ru.netology.domain;
public class Book extends Product {
    private String author;

    public Book(String name, int price, int id, String author) {
        super(name, price, id);
        this.author = author;
    }

    @Override
    public boolean matches(String query) {
        if (super.matches(query)) {
            return true;
        }
        if (author.contains(query)) {
            return true;
        }
        return false;

    }
}