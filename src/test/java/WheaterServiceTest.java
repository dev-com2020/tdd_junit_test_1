import org.example.WeatherService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class WheaterServiceTest {

    @Mock
    private WeatherService mockWeather;

//    @InjectMocks
//    private WeatherReporter weatherReporter;

    @Test
    void pogodynka_1(){
        when(mockWeather.getTemperature(anyString())).thenReturn(25);

        int temperature = mockWeather.getTemperature("Warszawa");
        assertEquals(25, temperature, "Temperatura powinna wynosić 25°C");

        verify(mockWeather, times(1)).getTemperature(anyString());
    }
}
