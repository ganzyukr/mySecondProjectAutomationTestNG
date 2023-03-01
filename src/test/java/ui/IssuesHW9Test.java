package ui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;
import pages.*;

public class IssuesHW9Test extends BaseTest {
    @Tag(name = "regression")
    @Test
    public void checkCreatingAnIssueOnTheIssuePage() {
        Logger logger = LogManager.getLogger();                                                // Створюємо об'єкт класу логування
        logger.info("checkCreatingAnIssueOnTheIssuePage Test start:");                      // Логування без кольору
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin("ganzyukr", "tata1607GTB");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToProfileForm();
        ProfileForm profileForm = new ProfileForm(driver);
        profileForm.goToRepositoriesPage();
        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
        repositoriesPage.goToMySecondProjectAutomation();

        MySecondProjectAutomationPageHW9 mySecondProjectAutomationPageHW9 = new MySecondProjectAutomationPageHW9(driver);
        mySecondProjectAutomationPageHW9.goToIssuesPage();

        IssuesPageHW9 issuesPageHW9 = new IssuesPageHW9(driver);
        issuesPageHW9.goToNewIssues();

        String textName = "Update requrements";
        String writeName = "Suggestions for updating requirements";

        NewIssuesPageHW9 newIssuesPageHW9 = new NewIssuesPageHW9(driver);
        newIssuesPageHW9.successfulCreationIssues(textName, writeName);

        CreatedIssuesPageHW9 createdIssuesPageHW9 = new CreatedIssuesPageHW9(driver);
        Assert.assertEquals(textName, createdIssuesPageHW9.getTextName());
        logger.info("checkCreatingAnIssueOnTheIssuePage Test passed successfully!");         // Логування без кольору
    }
    @Tag(name = "regression")
    @Test
    public void checkIsTheIssueCreated() {
        Logger logger = LogManager.getLogger();                                                // Створюємо об'єкт класу логування
        logger.info("checkIsTheIssueCreated Test start:");                                  // Логування без кольору
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin("ganzyukr", "tata1607GTB");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToProfileForm();
        ProfileForm profileForm = new ProfileForm(driver);
        profileForm.goToRepositoriesPage();
        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
        repositoriesPage.goToMySecondProjectAutomation();

        MySecondProjectAutomationPageHW9 mySecondProjectAutomationPageHW9 = new MySecondProjectAutomationPageHW9(driver);
        mySecondProjectAutomationPageHW9.goToIssuesPage();

        IssuesPageHW9 issuesPageHW9 = new IssuesPageHW9(driver);
        String textIssues = "Update requrements";
        Assert.assertEquals(textIssues, issuesPageHW9.getTextIssues());
        logger.info("checkIsTheIssueCreated Test passed successfully!");                     // Логування без кольору
    }
}
