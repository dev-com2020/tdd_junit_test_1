import org.apiguardian.api.API;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

@API(status = API.Status.STABLE, since = "5.0")
public class Extension implements BeforeEachCallback {

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        System.out.println("Przed testem: " + context.getDisplayName());
    }

}
