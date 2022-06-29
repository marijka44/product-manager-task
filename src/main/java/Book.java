public class Book extends Product {
    private String author;

    public Book(String name, int price, int id, String author) {
        super(name, price, id);
        this.author = author;
    }
}
