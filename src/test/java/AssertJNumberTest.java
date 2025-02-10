import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJNumberTest {

    @Test
    void testNumbers(){
        int value = 10;
        assertThat(value)
                .isPositive()
                .isGreaterThan(5)
                .isLessThan(20)
                .isBetween(8,12);
    }

    @Test
    testString(){
    }
}
