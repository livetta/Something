package tests;

import org.junit.Test;

public class WomanPageTest extends SampleTest
{

    @Test
    public void seeMoreInformationAboutItem ()
    {
        user.mainPage.openMainPage();
        user.myAccountPage.clickOnWomenTab();
        user.womanPage.moreAboutProduct();
    }

    @Test
    public void sortByPriceAsc ()
    {
        user.mainPage.openMainPage();
        user.myAccountPage.clickOnWomenTab();
        user.womanPage.sortByPrice();
    }

    @Test
    public void compareTwoItems ()
    {
        user.mainPage.openMainPage();
        user.myAccountPage.clickOnWomenTab();
        user.womanPage.compareTwoItems();
    }

    @Test
    public void changeViewToGrid ()
    {
        user.mainPage.openMainPage();
        user.myAccountPage.clickOnWomenTab();
        user.womanPage.listView();
    }


}
