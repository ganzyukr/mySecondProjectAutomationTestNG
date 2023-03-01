package old;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class FirstLesson8Test extends BaseTest {

    @Test
    public void someChecks() {

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

        Assertions.assertEquals(actualResult, expectedResult);
    }
}
