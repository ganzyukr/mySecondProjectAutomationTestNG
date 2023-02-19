import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW_8_XPath {

        WebDriver driver;

        @Test
        public void someChecks() {

            /** From lesson 8 from the teacher **/

            System.setProperty("webdriver.chrome.driver", "/Users/tatiana/mySecondProjectAutomation/src/main/resources/drivers/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("https://github.com/login");

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

            Assert.assertTrue(actualResult.equals(expectedResult));

            /** Start HW-8 num_1 **/

            WebElement mySecondProjectButton = driver.findElement(By.xpath("//div[@class='wb-break-word']//descendant::a"));
            mySecondProjectButton.click();

            WebElement masterButton = driver.findElement(By.xpath("//*[@id=\"branch-select-menu\"]/summary"));
            masterButton.click();

            WebElement findOrCreateBranchField = driver.findElement((By.id("context-commitish-filter-field")));
            findOrCreateBranchField.sendKeys("HW2");

            WebElement viewAllBranchesButton = driver.findElement(By.xpath("//*[@id=\"branch-select-menu\"]/summary"));
            viewAllBranchesButton.click();



            WebElement goToFileButton = driver.findElement(By.xpath("//a[contains(text(),'Go to file')]"));
            goToFileButton.click();

            WebElement branchesButton = driver.findElement(By.xpath("//span[(text()='branches')]"));
            branchesButton.click();

            WebElement createNewReleaseButton = driver.findElement(By.xpath("//a[contains(text(),'Create a new release')]"));
            createNewReleaseButton.click();

            WebElement codeButton = driver.findElement(By.xpath("//summary[@class='btn-primary btn']"));
            codeButton.click();


            WebElement textNoDescription = driver.findElement(By.xpath("//div[contains(text(),'No description, website, or topics provided.')]"));
            String actualResult1 = textNoDescription.getText();
            String expectedResult1 = "No description, website, or topics provided.";
            System.out.println(actualResult);

            Assert.assertTrue(actualResult1.equals(expectedResult1));


            WebElement textLanguages = driver.findElement(By.xpath("//h2[text()='Languages']"));
            String actualResult2 = textLanguages.getText();
            String expectedResult2 = "Languages";
            System.out.println(actualResult);

            Assert.assertTrue(actualResult2.equals(expectedResult2));


            WebElement actionsButton = driver.findElement(By.xpath("//a[@id='actions-tab']"));
            actionsButton.click();

            /** Start HW-8 num_2 **/

            WebElement searchWorkflowsField = driver.findElement((By.xpath("//input[@name='query']")));
            searchWorkflowsField.sendKeys("Android CI");
            searchWorkflowsField.sendKeys(Keys.ENTER);

            WebElement configureButton = driver.findElement(By.xpath("//a[text()='Configure'][2]"));
            configureButton.click();

            WebElement textGetStartedWithGitHubActions = driver.findElement(By.xpath("//h1[text()='Get started with GitHub Actions']"));
            String actualResult3 = textGetStartedWithGitHubActions.getText();
            String expectedResult3 = "Get started with GitHub Actions";
            System.out.println(actualResult);

            Assert.assertTrue(actualResult3.equals(expectedResult3));

            WebElement textCategories = driver.findElement(By.xpath("//input[@id=\"query\"]"));
            String actualResult4 = textCategories.getText();
            String expectedResult4 = "Categories";
            System.out.println(actualResult);

            Assert.assertTrue(actualResult4.equals(expectedResult4));

            WebElement pagesButton = driver.findElement(By.xpath("//a[text()='Configure'][2]"));
            pagesButton.click();


            driver.quit();
        }


}
