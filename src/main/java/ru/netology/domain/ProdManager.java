package ru.netology.domain;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ProdManager {

    private ProdRepository prodRepository;

    public ProdManager(ProdRepository prodRepository) {
        this.prodRepository = prodRepository;
    }

    public void add(Product product) {
        prodRepository.save(product);
    }

    // добавьте необходимые поля, конструкторы и методы

    public Product[] searchBy(String text) {
        Product[] result = new Product[0]; // тут будем хранить подошедшие запросу продукты
        for (Product product : this.prodRepository.findAll()) {
            if (product.matches(text)) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = product;
            }
        }
        return result;
    }
}
