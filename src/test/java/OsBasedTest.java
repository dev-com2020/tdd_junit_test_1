import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OsBasedTest {

    @Test
    @EnabledOnOs(OS.LINUX)
    void testOnlyOnWin(){
        assertTrue(System.getProperty("os.name").toLowerCase().contains("win"));
    }
}
