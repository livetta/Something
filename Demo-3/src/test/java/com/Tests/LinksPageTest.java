package com.Tests;

import org.junit.Test;

public class LinksPageTest extends SampleTest
{

    @Test
    public void FirstLinkTest()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenLinksPage();
        user.linksPage.CheckFirstLink();
    }

    @Test
    public void SecondLinkTest()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenLinksPage();
        user.linksPage.CheckSecondLink();
    }

    @Test
    public void ThirdLinkTest()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenLinksPage();
        user.linksPage.CheckThirdLink();
    }

}
