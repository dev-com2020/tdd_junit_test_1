import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @Test
    void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2,3));
    }
    @Test
    void testSubsract(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.substract(3,2));
    }
}
