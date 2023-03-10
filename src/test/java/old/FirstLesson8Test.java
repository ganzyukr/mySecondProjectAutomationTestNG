
package old;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstLesson8Test {

    WebDriver driver;

    @Test
    public void someChecks() {

        System.setProperty("webdriver.chrome.driver", "/Users/tatiana/mySecondProjectAutomation/src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://github.com/login");

        WebElement loginField = driver.findElement(By.id("login_field"));
        loginField.sendKeys("ganzyukr");

        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordField.sendKeys("tata1607GTB");

        WebElement signInButton = driver.findElement(By.xpath("//input[@value='Sign in']"));
        signInButton.click();

        WebElement textArea = driver.findElement(By.xpath("//h4[@class='col-10']"));

        String actualResult = textArea.getText();

        String expectedResult = "Start coding instantly with GitHub Codespaces";

        System.out.println(actualResult);

        Assertions.assertTrue(actualResult.equals(expectedResult));

        driver.quit();
    }
}
