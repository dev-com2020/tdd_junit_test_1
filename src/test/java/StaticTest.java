import org.example.StaticUtils;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class StaticTest {

    @Test
    void givenStaticMethodWithNoArgs_whenMocked_thenReturnsMockSuccessfully() {
//        assertThat(StaticUtils.name()).isEqualTo("Mockito");

        try (MockedStatic<StaticUtils> utils = Mockito.mockStatic(StaticUtils.class)) {
            utils.when(StaticUtils::name).thenReturn("Tomek");
            assertThat(StaticUtils.name()).isEqualTo("Tomek");
        }
//        assertThat(StaticUtils.name()).isEqualTo("Mockito");
    }


    @Test
    void givenStaticMethodWithArgs_whenMocked_thenReturnsMockSuccessfully() {
        assertThat(StaticUtils.range(2, 6)).containsExactly(2, 3, 4, 5);

        try (MockedStatic<StaticUtils> utils = Mockito.mockStatic(StaticUtils.class)) {
            utils.when(() -> StaticUtils.range(2, 6)).thenReturn(Arrays.asList(11, 12, 13));

            assertThat(StaticUtils.range(2, 6)).containsExactly(11, 12, 13);
        }
        assertThat(StaticUtils.range(2, 6)).containsExactly(2, 3, 4, 5);
    }
}
