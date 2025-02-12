import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicNumbersTest {

    @TestFactory
    Stream<DynamicTest> dynamicNumbers() {
        return IntStream.range(1,6).mapToObj(
                n -> DynamicTest.dynamicTest("Test dla n= "  + n, ()-> {
                    assertEquals(n * 2, n + n);
                }));
    }
}
