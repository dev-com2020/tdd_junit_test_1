
import org.example.Calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest extends BaseTest {

    @ParameterizedTest
    @CsvSource(value = {
            "2;3;6",
            "-3;2;-6",
            "0;5;0"
    }, delimiter = ';')
    void testMulti(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        try {
            assertEquals(expected, calculator.multiply(a,b));
            test.pass("Test passed");
        }catch (AssertionError e) {
            test.fail("Test failed: " + e.getMessage());
            throw e;
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 0, delimiter = ';')
    void testMultiFile(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.multiply(a,b));
    }


}
