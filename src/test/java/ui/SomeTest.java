package ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.ArrayList;
import java.util.List;

public class SomeTest extends BaseTest{

    @Test
    public void checkLogoOnTheLoginPage(){
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.getLogo().isDisplayed());
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
        expectedRepositoriesList.add("mySecondProjectAutomationTestNG");
        expectedRepositoriesList.add("mySecondProjectAutomation");
        expectedRepositoriesList.add("mySecondProject");
        expectedRepositoriesList.add("Project_Course_Work");
        expectedRepositoriesList.add("tatiana-maven");
        expectedRepositoriesList.add("ITEA");
        expectedRepositoriesList.add("FirstProject");

        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);

        Assert.assertEquals(expectedRepositoriesList, repositoriesPage.getRepositories());
    }
}
