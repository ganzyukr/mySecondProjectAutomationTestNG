package old;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/tatiana/mySecondProjectAutomation/src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://github.com");
    }
//    @AfterEach
//    public void tearDown() {
//        driver.quit();
//    }
}
