public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(String name, int price, int id, String manufacturer) {
        super(name, price, id);
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean matches(String query) {
        if (super.matches(query)) {
            return true;
        }
        if (manufacturer.contains(query)) {
            return true;
        }
        return false;
    }
}
