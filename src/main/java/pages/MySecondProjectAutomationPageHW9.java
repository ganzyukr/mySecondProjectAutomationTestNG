package pages;

import helpers.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helpers.ColorPrinter.printColorMessage;

public class MySecondProjectAutomationPageHW9 extends BasePage {

    private final static String TITLE = "MySecondProjectAutomation page";

    private WebElement issuesButton = driver.findElement(By.xpath("//*[@id=\"issues-tab\"]"));

    public MySecondProjectAutomationPageHW9(WebDriver driver) {
        super(driver, TITLE);
    }

    public IssuesPageHW9 goToIssuesPage() {
        issuesButton.click();
        //log.info("SSuccessfully click on the Issues button and go to the IssuesPage");                                     // Логування без кольору
        printColorMessage("Successfully click on the Issues button and go to the IssuesPage", log, Level.INFO);     // Логування кольорове
        return new IssuesPageHW9(driver);
    }
}
