import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public abstract class BaseTest {
    private static ExtentReports extent;
    private ExtentTest test;

    @BeforeAll
    static void setup_() {
        ExtentSparkReporter spark = new ExtentSparkReporter("target/test-reports/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @BeforeEach
    void beforeEach() {
        // Każdy test będzie miał swój wpis w raporcie
        test = extent.createTest("Test: " + System.nanoTime());
    }
    @AfterAll
    static void tearDown() {
        extent.flush();
    }
}
