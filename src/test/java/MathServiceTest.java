import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MathServiceTest {

    @Test
    void testMockSpy(){
        Calculator spyMathService = spy(new Calculator());
        doReturn(100).when(spyMathService).add(5,5);

        assertEquals(5,spyMathService.add(2,3));
        assertEquals(6,spyMathService.multiply(2,3));
        assertEquals(100,spyMathService.add(5,5));

        verify(spyMathService,times(1)).add(5,5);
//        verify(spyMathService,times(3));

    }
}
