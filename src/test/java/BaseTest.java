import org.junit.jupiter.api.BeforeAll;


public abstract class BaseTest {

    @BeforeAll
    static void setupGlobal(){
        System.out.println("Globalny setup...");
    }
}
