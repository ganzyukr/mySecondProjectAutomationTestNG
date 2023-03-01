package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class RepositoriesPage extends BasePage{

    private final static String TITLE = "Repositories page";

   private List<WebElement> repositories = driver.findElements(By.xpath("//a[@itemprop='name codeRepository']"));
    private WebElement mySecondProjectAutomationButton = driver
            .findElement(By.xpath("//a[contains(text(),'mySecondProjectAutomation')]"));

    public RepositoriesPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public List<String> getRepositories() {
        List<String> repositoriesList = repositories.stream().map(rep -> rep.getText()).collect(Collectors.toList());
        return repositoriesList;
    }

    public MySecondProjectAutomationPageHW9 goToMySecondProjectAutomation() {
        mySecondProjectAutomationButton.click();
        return new MySecondProjectAutomationPageHW9(driver);
    }
}
