import org.example.WeatherService;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DynamicWeatherTest {

    @Mock
    private WeatherService mockWeatherService;

    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestsForWeather(){
        setup();
        return Stream.of(
                new Object[]{"Warszawa",20},
                new Object[]{"Kielce",25}
        ).map(tc-> DynamicTest.dynamicTest("Temperatura w " + tc[0], ()-> {
            when(mockWeatherService.getTemperature((String) tc[0])).thenReturn((int) tc[1]);
            int result = mockWeatherService.getTemperature((String) tc[0]);

            assertEquals(tc[1],result);

        }));
    }
}
