import org.example.WeatherService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class WeatherTest {

    @Test
    void pogodynka(){
        WeatherService mockWeather = mock(WeatherService.class);
        when(mockWeather.getTemperature(anyString())).thenReturn(25);

        int temperature = mockWeather.getTemperature("Warszawa");
        assertEquals(25, temperature, "Temperatura powinna wynosić 25°C");

        verify(mockWeather, times(1)).getTemperature(anyString());
    }

    @Test
    void pogodynkaMiasta(){
        WeatherService mockWeather = mock(WeatherService.class);
        when(mockWeather.getTemperature("Kielce")).thenReturn(25);
        when(mockWeather.getTemperature("Radom")).thenReturn(22);
        when(mockWeather.getTemperature("Kraków")).thenReturn(20);
        when(mockWeather.getTemperature("Nieznane"))
                .thenThrow(new IllegalArgumentException("Nieznana lokalizacja"));

        assertEquals(25,mockWeather.getTemperature("Kielce"));
        assertEquals(22,mockWeather.getTemperature("Radom"));
        assertEquals(20,mockWeather.getTemperature("Kraków"));
        assertThrows(IllegalArgumentException.class, ()->{
            mockWeather.getTemperature("Nieznane");
        });
//        assertEquals(0,mockWeather.getTemperature("Berlin"));

        verify(mockWeather).getTemperature("Kielce");
        verify(mockWeather).getTemperature("Radom");
        verify(mockWeather).getTemperature("Kraków");
        verify(mockWeather, never()).getTemperature("Berlin");

    }
}