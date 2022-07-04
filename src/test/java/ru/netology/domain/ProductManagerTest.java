package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductManagerTest {
    Book book1 = new Book("Bio", 100, 1, "Ivanov");
    Book book2 = new Book("Sweet", 200, 2, "Petrov");
    Book book3 = new Book("BioNew", 300, 3, "Smirnov");
    Smartphone smartphone1 = new Smartphone("Samsung", 400, 4, "China");
    Smartphone smartphone2 = new Smartphone("Motorola", 500, 5, "Japan");

    @Test
    public void shouldFindElements() {
        ProdManager manager = new ProdManager(new ProdRepository());
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] actual = manager.searchBy("Moto");
        Product[] expected = {smartphone2};

        assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindElementsInEmptyManager() {
        ProdManager manager = new ProdManager(new ProdRepository());


        Product[] actual = manager.searchBy("Bio");
        Product[] expected = {};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindElementsManagerHasOneElement() {
        ProdManager manager = new ProdManager(new ProdRepository());
        manager.add(smartphone2);

        Product[] actual = manager.searchBy("Sam");
        Product[] expected = {};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFind2Elements() {
        ProdManager manager = new ProdManager(new ProdRepository());
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] actual = manager.searchBy("nov");
        Product[] expected = {book1 ,book3};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindElementsWhichIsNot() {
        ProdManager manager = new ProdManager(new ProdRepository());
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] actual = manager.searchBy("Abc");
        Product[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void productRemovalById() {
        ProdRepository prodRepository = new ProdRepository();

        prodRepository.save(book1);
        prodRepository.save(book2);
        prodRepository.save(book3);
        prodRepository.save(smartphone1);
        prodRepository.save(smartphone2);

        prodRepository.removeById(5);

        Product[] actual = prodRepository.findAll();
        Product[] expected = {book1, book2, book3, smartphone1};


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void productRemovalByIdFalse() {
        ProdRepository prodRepository = new ProdRepository();

        prodRepository.save(book1);
        prodRepository.save(book2);
        prodRepository.save(book3);
        prodRepository.save(smartphone1);
        prodRepository.save(smartphone2);

        prodRepository.removeById(6);

        Product[] actual = null;
        Product[] expected = null ;


        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void productRemovalByIdFalseNull() {
        ProdRepository prodRepository = new ProdRepository();
        prodRepository.save(book1);
        prodRepository.save(null);
        prodRepository.save(book3);
        prodRepository.save(smartphone1);
        prodRepository.save(smartphone2);


        Product[] actual = prodRepository.findAll();
        Product[] expected = {book1, null, book3, smartphone1, smartphone2};


        Assertions.assertArrayEquals(expected, actual);

    }
}
