package com.Tests;

import org.junit.Test;

public class DynamicPropertiesPageTest extends SampleTest
{
    @Test
    public void AllSelectedCheckBoxTest()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenDynamicPropertiesPage();
        user.dynamicPage.CheckIdOfTheText();
    }

    @Test
    public void IfButtonClickable ()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenDynamicPropertiesPage();
        user.dynamicPage.CheckClickableButton();
    }

    @Test
    public void IfButtonIsDisplayed ()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenDynamicPropertiesPage();
        user.dynamicPage.CheckDisplayedAfterButton();
    }

    @Test
    public void IfColorChanged () {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenDynamicPropertiesPage();
        user.dynamicPage.CheckColorChangeButton();
    }

}
