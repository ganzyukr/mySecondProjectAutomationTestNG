package pages;

import helpers.Level;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static helpers.ColorPrinter.printColorMessage;

public class NewIssuesPageHW9 extends BasePage {

    private final static String TITLE = "NewIssues page";

    private WebElement titleField = driver.findElement(By.xpath("//*[@id=\"issue_title\"]"));
    private WebElement writeField = driver.findElement(By.xpath("//*[@id=\"issue_body\"]"));
    private WebElement submitNewIssueButton = driver
            .findElement(By.xpath("//button[contains(text(),'Submit new issue')][1]"));

    public NewIssuesPageHW9(WebDriver driver) {
        super(driver, TITLE);
    }

    public CreatedIssuesPageHW9 successfulCreationIssues(String title, String write) {
        titleField.click();
        titleField.sendKeys(title);
        writeField.click();
        writeField.sendKeys(write);
        submitNewIssueButton.click();
        printColorMessage("Successful Creation Issues", log, Level.INFO);               // Логування кольорове
        return new CreatedIssuesPageHW9(driver);
    }
}
