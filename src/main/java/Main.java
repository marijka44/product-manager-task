import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ProdManager manager = new ProdManager(new ProdRepository());
        manager.add(new Book("Bio",100, 1, "Ivanov"));
        manager.add(new Smartphone("Samsung", 200, 2, "China" ));
        manager.add(new Smartphone("Motorola", 300, 3, "Japan" ));
        manager.add(new Book("Sweet", 400, 4, "Petrov"));
        manager.add(new Book("BioNew", 500, 5, "Smirnov"));

        Product[] products = manager.searchBy("Moto");
        for (Product product: products) {
            System.out.println(product.getName());
        }

        Product[] products1 = manager.searchBy("Bio");
        for (Product product: products1) {
            System.out.println(product.getName());
        }
    }
}