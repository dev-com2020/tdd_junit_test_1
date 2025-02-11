import org.example.ShoppingCart;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    void setup(){
        cart = new ShoppingCart();
    }
    @AfterEach
    void tearDown(){
        cart = null;
    }

    @Test
    void testAddItem(){
        cart.addItem("Iphone");
        assertEquals(1, cart.getItemCount(), "Koszyk musi zawierać 1 element");
    }

    @Test
    void testMultiItem(){
        cart.addItem("Iphone");
        cart.addItem("Klawiatura");
        assertEquals(2, cart.getItemCount(), "Koszyk musi zawierać 2 element");
    }


}
