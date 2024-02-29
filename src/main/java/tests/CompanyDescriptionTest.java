package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import utility.TestDataReader;

public class CompanyDescriptionTest extends BaseClass {

    @Test
    public void testCaseOne() {
        LoginPage loginPage = new LoginPage();
        Assert.assertTrue(loginPage.state().waitForDisplayed(), "Login Page Not Opened");

        String email = TestDataReader.getEmail();
        String password = TestDataReader.getPassword();

        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
    }
}
