package tests;

import Helper.Properties;
import org.junit.Test;

public class CheckAuthenticationAlertAfterLogin extends SampleTest
{
    @Test
    public void CheckAuthenticationAlertAfterLoginTest ()
    {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.loginPage.fillEmailAddress(Properties.INSTANCE.getProperties("email"));
        user.loginPage.fillPassword(Properties.INSTANCE.getProperties("password"));
        user.loginPage.clickSignInLogin();
        user.loginPage.checkIfAlertMessageIsDisplayed();;
        user.loginPage.checkIfAlertMessageIsCorrect(Properties.INSTANCE.getProperties("alertAuthentication"));
    }
}
