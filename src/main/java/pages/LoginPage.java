package pages;

import helpers.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helpers.ColorPrinter.printColorMessage;

public class LoginPage extends BasePage{

    private final static String TITLE = "Login page";

    private WebElement loginField = driver.findElement(By.id("login_field"));
    private WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
    private WebElement signInButton = driver.findElement(By.xpath("//input[@value='Sign in']"));

    private WebElement logo = driver.findElement(By.className("header-logo"));


    public LoginPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public WebElement getLogo() {
        return logo;
    }

    public MainPage successfulLogin(String login, String password){
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        signInButton.click();
        log.info("Successful authorization");                                     // Логування без кольору
        printColorMessage("Successful authorization", log, Level.INFO);     // Логування кольорове
        return new MainPage(driver);
    }
}
