import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class ProjectTestBase {

    protected static WebDriver chromeDriver;

    private static ProjectSettings projectSettings = new ProjectSettings();

    @BeforeClass
    public static void testSettings(){
        // set project WebDriver
        projectSettings.setProjectWebDriver();
        chromeDriver = projectSettings.getDriver();
    }

    @AfterClass
    public static void tearsDown() throws InterruptedException {
        Thread.sleep(1500);
        chromeDriver.quit();
    }
}