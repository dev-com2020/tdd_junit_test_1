import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LegacyJunit4Test {

    @Test
    public void myFirstTest(){
        String message = "2+2 powinno być 4";
        System.out.println(message);
        assertEquals(message, 4,2+2);
    }
}
