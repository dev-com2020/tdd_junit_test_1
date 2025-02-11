import org.example.StaticUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mockStatic;

public class MockedStaticRegisteredTest {

    private MockedStatic<StaticUtils> mockStatic;

    @BeforeEach
    void setup(){
        mockStatic = mockStatic(StaticUtils.class);
    }

    @AfterEach
    void tearDown(){
        mockStatic.close();
    }
    @Test
    void givenStaticMockRegister_whenMocked_thenReturnsMockSuccess(){
        assertTrue(Mockito.mockingDetails(StaticUtils.class).isMock());
    }
    @Test
    void givenAnotherStaticMockRegister_whenMocked_thenReturnsMockSuccess(){
        assertTrue(Mockito.mockingDetails(StaticUtils.class).isMock());
    }

}
