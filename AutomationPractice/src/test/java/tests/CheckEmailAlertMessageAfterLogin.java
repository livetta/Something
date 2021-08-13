package tests;

import Helper.Properties;
import org.junit.Test;

public class CheckEmailAlertMessageAfterLogin extends SampleTest {

    @Test
    public void CheckEmailAlertAfterLoginTest ()
    {

        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.loginPage.fillPassword(Properties.INSTANCE.getProperties("password"));
        user.loginPage.clickSignInLogin();
        user.loginPage.checkIfAlertMessageIsDisplayed();
        user.loginPage.checkIfAlertMessageIsCorrect(Properties.INSTANCE.getProperties("alertEmail"));
    }
}
