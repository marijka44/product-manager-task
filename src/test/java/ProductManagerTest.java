import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductManagerTest {
   Book book1 = new Book("Bio",100, 1, "Ivanov");
   Book book2 = new Book("Sweet", 400, 4, "Petrov");
   Book book3 = new Book("BioNew", 400, 4, "Smirnov");
   Smartphone smartphone1 = new Smartphone("Samsung", 200, 2, "China" );
   Smartphone smartphone2 = new Smartphone("Motorola", 300, 3, "Japan" );

    @Test
    public void shouldFindElements() {
        ProdManager manager = new ProdManager(new ProdRepository());
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] actual = manager.searchBy("Moto");
        Product[] expected = { smartphone2 };

        assertArrayEquals(expected, actual);




    }
}
