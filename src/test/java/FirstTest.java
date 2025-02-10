import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(Extension.class)
public class FirstTest {

    @Test
    void myFirstTest(){
        String message = "2+2 powinno być 4";
        System.out.println(message);
        assertEquals(4,2+2, message);
    }
}
