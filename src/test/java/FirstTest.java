import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {

    @Test
    void myFirstTest(){
        String message = "2+2 powinno być 4";
        System.out.println(message);
        assertEquals(4,2+2, message);
    }
}
