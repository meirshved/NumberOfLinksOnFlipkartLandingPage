import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AutomationTest extends ProjectTestBase {

    private final String FLIPKART_URL = "https://flipkart.com";

    private List <WebElement> links = chromeDriver.findElements(By.tagName("a"));

    JavascriptExecutor js = (JavascriptExecutor)chromeDriver;

    @Test
    public void test_1_openFlipkartLandingPage() {
        chromeDriver.get(FLIPKART_URL);
    }

    @Test
    public void test_2_ClosePopUp(){
        chromeDriver.findElement(By.cssSelector("button[class = '_2AkmmA _29YdH8']")).click();
    }

    @Test
    public void test_3_CountPageLinks() {
        System.out.println("Number of links on the page is " + links.size());
    }

    @Test
    public void test_4_PrintNameAndURLForEachLink() {
        for (WebElement link : links) {
            System.out.print(links.indexOf(link) + ". " + "\n");
            System.out.println("text: " + js.executeScript("return arguments[0].innerText;", link));
            System.out.println("URL: " + link.getAttribute("href") + "\n");
        }
    }
}