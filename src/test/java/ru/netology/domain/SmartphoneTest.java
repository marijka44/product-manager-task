package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartphoneTest {
    @Test
    public void matchesShouldReturnTrueIfNameIsEqual() {
        Smartphone smartphone = new Smartphone("Samsung", 400, 4, "China");

        Boolean actual = smartphone.matches("Sam");
        Boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void matchesShouldReturnTrueIfManufacturerIsEqual() {
        Smartphone smartphone = new Smartphone("Samsung", 400, 4, "China");

        Boolean actual = smartphone.matches("China");
        Boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void matchesShouldReturnTrueIfFalse() {
        Smartphone smartphone = new Smartphone("Samsung", 400, 4, "China");

        Boolean actual = smartphone.matches("test");
        Boolean expected = false;

        assertEquals(expected, actual);
    }
}
