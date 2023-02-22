package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MySecondProjectAutomationPageHW9 extends BasePage {

    private WebElement issuesButton = driver.findElement(By.xpath("//*[@id=\"issues-tab\"]"));


    public MySecondProjectAutomationPageHW9(WebDriver driver) {
        super(driver);
    }

    public IssuesPageHW9 goToIssuesPage() {
        issuesButton.click();
        return new IssuesPageHW9(driver);
    }
}
