package tests;

import Helper.Properties;
import org.junit.Test;

public class LoginTest extends SampleTest {

    @Test
    public void loginTest (){

        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.loginPage.fillEmailAddress(Properties.INSTANCE.getProperties("email"));
        user.loginPage.fillPassword(Properties.INSTANCE.getProperties("password"));
        user.loginPage.clickSignInLogin();
    }
}
