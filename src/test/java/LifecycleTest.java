import org.example.Address;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Wykonujemy testy cyklu życia aplikacji")
public class LifecycleTest {

    @BeforeAll
    static void setupAll(){
        System.out.println("Setup ALL TEST in the class");
    }
    @BeforeEach
    void setup(){
        System.out.println("Setup EACH TEST in the class");
    }
    @Test
    @DisplayName("Custom test name with spaces")
    void testOne(){
        System.out.println("TEST 1");
    }
    @Test
    void testTwo(){
        System.out.println("TEST 2");
    }
    @Disabled("Na czas umieszczenia w kodzie mocków")
    @Test
    void skippedTest(){
        System.out.println("TEST 3");
    }

//    @Test
//    void standardAssertion(){
//        assertEquals(2,2);
//        assertTrue(true);
//        assertFalse(false);
//    }

    @Test
    void groupedAssertions() {
        Address address = new Address("John","Kowalski");
        assertAll("address",
                () -> assertEquals("John", address.getFirstName()),
                () -> assertEquals("Kowalski", address.getLastName()));
    }



    @AfterEach
    void teardown(){
        System.out.println("Teardown EACH TEST");
    }

    @AfterAll
    static void teardownAll(){
        System.out.println("Teardown ALL TEST");
    }
}
