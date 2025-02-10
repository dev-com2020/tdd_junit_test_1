import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testAddition {

    @Test
    void calcTest(){
    //      Arrange (przygotowanie)

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 5;

    //      Act (działanie)

        int result = calculator.multiply(a,b);

    //      Assert (sprawdzanie)
        assertEquals(25,result,"Mnożenie");

    }


}
