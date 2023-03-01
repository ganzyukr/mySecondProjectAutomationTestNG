package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{

    WebElement img = driver.findElement(By.xpath("//summary[@aria-label='View profile and more']"));
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public ProfileForm goToProfileForm(){
        img.click();
        return new ProfileForm(driver);
    }
}
