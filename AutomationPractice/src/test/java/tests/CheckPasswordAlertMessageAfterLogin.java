package tests;

import Helper.Properties;
import org.junit.Test;

public class CheckPasswordAlertMessageAfterLogin extends SampleTest {

    @Test
    public void CheckPasswordAlertAfterLoginTest ()
    {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.loginPage.fillEmailAddress(Properties.INSTANCE.getProperties("email"));
        user.loginPage.clickSignInLogin();
        user.loginPage.checkIfAlertMessageIsDisplayed();
        user.loginPage.checkIfAlertMessageIsCorrect(Properties.INSTANCE.getProperties("alertPassword"));
    }
}
