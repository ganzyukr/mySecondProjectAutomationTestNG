package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfileForm extends BasePage {

    private final static String TITLE = "ProfileForm page";

    private WebElement yourRepositoriesButton = driver.findElement(By.xpath("//a[text()='Your repositories']"));

    public ProfileForm(WebDriver driver) {
        super(driver, TITLE);
    }

    public RepositoriesPage goToRepositoriesPage() {
        yourRepositoriesButton.click();
        return new RepositoriesPage(driver);
    }
}
