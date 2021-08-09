package com.Tests;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRadioPage extends SampleTest
{

    @Test
    public void YesRadioTest()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenRadioPage();
        user.radioPage.YesClick();
    }

    @Test
    public void ImpressiveRadioTest()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenRadioPage();
        user.radioPage.ImpressiveClick();
    }

    @Test
    public void NoRadioTest()
    {
        user.mainPage.MoveToElementsPage();
        user.elementsPage.OpenRadioPage();
        user.radioPage.NoClick();
    }

}
