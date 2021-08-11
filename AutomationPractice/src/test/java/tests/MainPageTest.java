package tests;

import org.junit.Test;

public class MainPageTest extends SampleTest
{
    @Test
    public void  AboutUsButton()
    {
        user.mainPage.openMainPage();
        user.mainPage.clickOnAboutUsButton();
    }
}
