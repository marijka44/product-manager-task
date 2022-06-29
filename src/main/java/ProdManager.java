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
            if (matches(product, text)) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = product;
            }
        }
        return result;
    }

    // метод определения соответствия товара product запросу search
    public boolean matches(Product product, String search) {
        if (product.getName().contains(search)) {
            return true;
        } else {
            return false;
        }
        // или в одну строку:
        // return product.getName().contains(search);
    }

}
