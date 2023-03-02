package ui;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

import java.util.ArrayList;
import java.util.List;

public class SomeTestGitHubTests extends BaseTest{

    /** depends On Methods Test (lesson 12) **/
    @Test
    public void precondition() {
        System.out.println("I am precondition");
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "precondition")
    public void checkLogoOnTheLoginPage(){
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.getLogo().isDisplayed());
    }


    @Test(priority = 1)
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
    /** Negative Login Test (with lesson 11) **/
    @Test
    public void verifyNegativeLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginNegative("1ganzyukr", "tata1607GTB");
        loginPage.validateErrorMessage("Incorrect username or password.");
    }


    /** Parametreised Negative Login Test (lesson-12) **/
    @DataProvider( name = "dataProvider2" )
    public Object[][] credentialProvider() {
        return new Object[][] {
                {"ganzyukr111", "tata1607GTB111"},
                {"ganzyukr222", "tata1607GTB222"},
                {"ganzyukr333", "tata1607GTB333"},
        };
    }
    @Test(dataProvider = "dataProvider2")
    public void verifyNegativeLoginParaametrized(String login, String password) {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginNegative(login, password);
        loginPage.validateErrorMessage("Incorrect username or password.");
    }


    /** Parametreised Test (lesson-12) **/
    @DataProvider( name = "dataProvider1" )
    public Object[][] createData() {
        return new Object[][] {
                {"Alex", 20},
                {"Kate", 18},
                {"Mary", 19},
        };
    }
    @Test(dataProvider = "dataProvider1")
    public void verifyData(String n1, Integer n2) {
        System.out.println(n1 + " " + n2);
    }


    /** SoftAssert - аналог AssertAll в Junit **/
    @Test
    public void someChecks() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false);
        softAssert.assertEquals(2, 3);
        softAssert.assertTrue(true);
        softAssert.assertAll();
    }

    /** Parametreised Test (HW-12) **/
    @DataProvider( name = "myRepositoriesList" )
    public Object[][] createDataMyRepositoriesList() {
        return new Object[][] {
                {"mySecondProjectAutomationTestNG", 7},
                {"mySecondProjectAutomation", 6},
                {"mySecondProject", 5},
                {"Project_Course_Work", 4},
                {"tatiana-maven", 3},
                {"ITEA", 2},
                {"FirstProject", 1},
        };
    }
    @Test(dataProvider = "myRepositoriesList")
    public void verifyDataMyRepositoriesList(String n1, Integer n2) {
        System.out.println(n1 + " " + n2);
    }
}
