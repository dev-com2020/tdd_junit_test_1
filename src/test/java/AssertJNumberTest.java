import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

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
    void testString(){
        String text = "Hello, World!";
        assertThat(text)
                .isNotEmpty()
                .contains("World")
                .startsWith("Hello")
                .endsWith("!")
                .doesNotContain("Cześć")
                .matches("Hello,\\s\\w+!");
    }

    @Test
    void testList(){
        List<String> owoce = List.of("Banan", "Wiśnia", "Jabłko");
        assertThat(owoce)
                .isNotEmpty()
                .hasSize(3)
                .contains("Banan")
                .doesNotContain("Mango")
                .containsExactly("Banan", "Wiśnia", "Jabłko");
    }

    @Test
    void testMap(){
        Map<String,Integer> ages = Map.of("Alicja", 25, "Bob", 30);

        assertThat(ages)
                .isNotEmpty()
                .containsKeys("Bob")
                .containsValue(25)
                .doesNotContainKey("Tomek")
                .containsEntry("Alicja", 25);
    }
}
