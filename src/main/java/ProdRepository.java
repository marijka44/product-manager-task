import java.util.Arrays;

public class ProdRepository {
    private Product[] products;

    public ProdRepository() {
        this.products = new Product[0];
    }

    public void save(Product product) {
        this.products = Arrays.copyOf(this.products, this.products.length + 1);
        this.products[this.products.length - 1] = product;
    }

    public Product[] findAll() {
        return this.products;
    }

    public void removeById(int id) {
        for (int i = 0; i < this.products.length; i++) {
            Product product = this.products[i];
            if (product.getId() == id) {
                this.products[i] = null;
                break;
            }
        }

        Product[] products = new Product[this.products.length - 1];
        for (int i = 0; i < products.length; i++) {
            if (this.products[i] != null) {
                products[i] = this.products[i];
            }
        }

        this.products = products;
    }
}
