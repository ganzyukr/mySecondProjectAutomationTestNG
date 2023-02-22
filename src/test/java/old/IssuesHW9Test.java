package old;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

public class IssuesHW9Test extends BaseTest {

    @Test
    public void checkCreatingAnIssueOnTheIssuePage() {
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
        Assertions.assertEquals(textName, createdIssuesPageHW9.getTextName());
    }

    @Test
    public void checkIsTheIssueCreated() {
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
        Assertions.assertEquals(textIssues, issuesPageHW9.getTextIssues());
    }
}
