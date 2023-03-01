package ui;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class BaseTest {
    private String title;
    protected Logger log;

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/tatiana/mySecondProjectAutomationTestNG/src/main/resources/drivers/chromedriver");
        Logger logger = LogManager.getLogger();                                              // Створюємо об'єкт класу логування
        logger.info("Chrome driver object creation starting");                            // Логування без кольору
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://github.com");
        logger.info("ChromeDriver was started successfully");                             // Логування без кольору
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        Logger logger = LogManager.getLogger();                                                                    // Створюємо об'єкт класу логування
        logger.info("The test was passed, the page was successfully closed");                                   // Логування без кольору
        //printColorMessage("The test was passed, the page was successfully closed", log, Level.INFO);             // Логування кольорове (з ним тест падає)
    }
}
