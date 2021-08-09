package com.Tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import java.io.IOException;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ImagePageTest extends  SampleTest
{
    @Test
    public void FirstLinkTest()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenImagePage();
        user.imagePage.CheckValidLink();
    }

    @Test
    public void BrokenLinkTest() throws IOException
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenImagePage();
        user.imagePage.CheckBrokenLink();
    }

    @Test
    public void FirstImageTest()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenImagePage();
        user.imagePage.CheckFirstImage();
    }

    @Test
    public void SecondImageTest()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenImagePage();
        user.imagePage.CheckSecondImage();
    }

}
