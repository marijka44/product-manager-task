public class Product {
    protected String name;
    protected int price;
    protected int id;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public Product(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public boolean matches(String query) {
        return this.name.contains(query);
    }
}