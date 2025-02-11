import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicTests {
    @TestFactory
    Stream<DynamicTest> dynamicTestFromStream(){
        return Stream.of(
                DynamicTest.dynamicTest("Test 1: 2+2=4", () -> assertEquals(4,2+2)),
                DynamicTest.dynamicTest("Test 2: 3+2=5", () -> assertEquals(5,3+2))
        );
    }
}
