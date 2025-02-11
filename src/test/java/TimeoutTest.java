import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TimeoutTest {

    @Test
    @Tag("slow")
    void timeoutNotExceeded(){
        assertTimeout(Duration.ofMinutes(2), () -> {
//            taski...
        });
    }

//    @Test
//    @Tag("fast")
//    void timeoutExceeded(){
//        assertTimeout(Duration.ofMillis(10), () -> {
//            Thread.sleep(100);
//        });
//    }

    @Test
    @Tags({ @Tag("fast"), @Tag("integration")})
    void timeoutNotExceededWithMethod(){
        String actualGreeting = assertTimeout(Duration.ofMinutes(1),
                TimeoutTest::greeting);
        assertEquals("Cześć", actualGreeting);
    }

    private static String greeting(){
        return "Cześć";
    }
}
