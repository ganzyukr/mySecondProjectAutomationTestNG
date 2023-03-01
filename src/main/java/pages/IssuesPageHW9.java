package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssuesPageHW9 extends BasePage {

    private final static String TITLE = "Issues page";

    private WebElement newIssueButton = driver.findElement(By.xpath("//span[@class='d-none d-md-block']"));

    private WebElement textIssues = driver.findElement(By.xpath("//a[(text()='Update requrements')][1]"));

    public String getTextIssues() {
        return textIssues.getText();
    }

    public IssuesPageHW9(WebDriver driver) {
        super(driver, TITLE);
    }

    public NewIssuesPageHW9 goToNewIssues() {
        newIssueButton.click();
        return new NewIssuesPageHW9(driver);
    }
}

