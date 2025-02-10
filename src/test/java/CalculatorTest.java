import org.example.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {
            "2;3;6",
            "-3;2;-6",
            "0;5;0"
    }, delimiter = ';')
    void testMulti(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.multiply(a,b));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 0, delimiter = ';')
    void testMultiFile(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.multiply(a,b));
    }
}
