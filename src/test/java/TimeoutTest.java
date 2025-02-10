import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TimeoutTest {

    @Test
    void timeoutNotExceeded(){
        assertTimeout(Duration.ofMinutes(2), () -> {
//            taski...
        });
    }

    @Test
    void timeoutExceeded(){
        assertTimeout(Duration.ofMillis(10), () -> {
            Thread.sleep(100);
        });
    }

    @Test
    void timeoutNotExceededWithMethod(){
        String actualGreeting = assertTimeout(Duration.ofMinutes(1),
                TimeoutTest::greeting);
        assertEquals("Cześć", actualGreeting);
    }

    private static String greeting(){
        return "Cześć";
    }
}
