import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class BrowserTest {
    public static WebDriver driver;
    @BeforeClass
    public static void property() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\WebdriverSelenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void shutdown() {
       // driver.quit();
    }
}
