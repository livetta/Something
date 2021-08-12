package tests;

import org.junit.Test;

public class SearchTest extends SampleTest
{
    @Test
    public void searchForItem ()
    {
        user.mainPage.openMainPage();
        user.womanPage.searchForItem("shirt");
    }

    @Test
    public void searchForNotExistingItems ()
    {
        user.mainPage.openMainPage();
        user.womanPage.searchForNotExistingItems("fdg");
    }

}
