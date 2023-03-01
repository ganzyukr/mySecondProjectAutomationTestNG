package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatedIssuesPageHW9 extends BasePage {

    private WebElement textNameField = driver
            .findElement(By.xpath("//bdi[(text()='Update requrements')]"));

    public String getTextName() {
        return textNameField.getText();
    }

    public CreatedIssuesPageHW9(WebDriver driver) {
        super(driver);
    }
}
