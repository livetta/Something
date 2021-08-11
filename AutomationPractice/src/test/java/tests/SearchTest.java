package tests;

import org.junit.Test;

public class SearchTest extends SampleTest
{
    @Test
    public void SearchForItem ()
    {
        user.mainPage.openMainPage();
        user.womanPage.SearchFor("shirt");
    }

    @Test
    public void SearchForNotExistingItems ()
    {
        user.mainPage.openMainPage();
        user.womanPage.SearchForNotExistingItems("fdg");
    }

}
