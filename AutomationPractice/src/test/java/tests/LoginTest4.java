package tests;

import Helper.Properties;
import org.junit.Test;

public class LoginTest4 extends SampleTest
{
    @Test
    public void loginTest ()
    {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.loginPage.fillEmailAddress(Properties.INSTANCE.getProperties("email"));
        user.loginPage.fillPassword(Properties.INSTANCE.getProperties("password"));
        user.loginPage.clickSignInLogin();
        user.loginPage.allertMessageIsDisplayed();
        user.loginPage.allertMessageIsCorrect(Properties.INSTANCE.getProperties("alertAuthentication"));
    }
}
