import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExpectionTest {

    @Test
    void exceptionTesting(){
        Throwable ex =
                assertThrows(IllegalArgumentException.class,
                        () -> {
                    throw new IllegalArgumentException("wiadomość");
                        });
        assertEquals("wiadomość", ex.getMessage());
    }
}
