package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    public void matchesShouldReturnTrueIfNameIsEqual() {
        Book book = new Book("Bio", 100, 1, "Ivanov");

        Boolean actual = book.matches("Bio");
        Boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void matchesShouldReturnTrueIfAuthorIsEqual() {
        Book book = new Book("Bio", 100, 1, "Ivanov");

        Boolean actual = book.matches("Ivanov");
        Boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void matchesShouldReturnTrueIfFalse() {
        Book book = new Book("Bio", 100, 1, "Ivanov");

        Boolean actual = book.matches("test");
        Boolean expected = false;

        assertEquals(expected, actual);
    }
}
