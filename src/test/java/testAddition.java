import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class testAddition {

    @RepeatedTest(value = 2, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("Test kalkulatora")
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
