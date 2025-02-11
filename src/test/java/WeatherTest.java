import org.example.WeatherService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherTest {


    @Test
    void pogodynka(){
        WeatherService mockWeather = mock(WeatherService.class);
        when(mockWeather.getTemperature(anyString())).thenReturn(25);
        int temperature = mockWeather.getTemperature("Warszawa");
        assertEquals(25, temperature, "Temperatura powinna wynosić 25°C");

    }
}