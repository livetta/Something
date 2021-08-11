package tests;

import org.junit.Test;

public class WomanPageTest extends SampleTest
{

    @Test
    public void SeeMoreInformation ()
    {
        user.mainPage.openMainPage();
        user.myAccountPage.clickOnWomenTab();
        user.womanPage.MoreAboutProduct();
    }

    @Test
    public void SortByPriceAsc ()
    {
        user.mainPage.openMainPage();
        user.myAccountPage.clickOnWomenTab();
        user.womanPage.SortByPrice();
    }

    @Test
    public void CompareTwoItems ()
    {
        user.mainPage.openMainPage();
        user.myAccountPage.clickOnWomenTab();
        user.womanPage.CompareTwoItems();
    }

    @Test
    public void ChangeViewToGrid ()
    {
        user.mainPage.openMainPage();
        user.myAccountPage.clickOnWomenTab();
        user.womanPage.ListView();
    }


}
