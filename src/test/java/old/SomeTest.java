package old;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

import java.util.ArrayList;
import java.util.List;

public class SomeTest extends BaseTest{

    @Test
    public void checkLogoOnTheLoginPage(){
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        Assertions.assertTrue(loginPage.getLogo().isDisplayed());
    }

    @Test
    public void checkRepositoriesList(){
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin("ganzyukr", "tata1607GTB");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToProfileForm();
        ProfileForm profileForm = new ProfileForm(driver);
        profileForm.goToRepositoriesPage();

        List<String> expectedRepositoriesList = new ArrayList<>();
        expectedRepositoriesList.add("mySecondProjectAutomation");
        expectedRepositoriesList.add("mySecondProject");
        expectedRepositoriesList.add("Project_Course_Work");
        expectedRepositoriesList.add("tatiana-maven");
        expectedRepositoriesList.add("ITEA");
        expectedRepositoriesList.add("FirstProject");

        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);

        Assertions.assertEquals(expectedRepositoriesList, repositoriesPage.getRepositories());
    }
}
