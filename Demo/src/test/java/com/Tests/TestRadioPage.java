package com.Tests;

import com.Pages.ButtonsPage;
import com.helpers.Config;
import com.Pages.RadioPage;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.BeforeClass;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TestRadioPage extends SampleTest
{
    @BeforeClass
    public static void set()
    {
        SampleTest.setup("radioPage");
    }

    @Test
    public void YesRadioTest()
    {
        assertEquals(radioPage.YesClick(),"You have selected Yes");
    }

    @Test
    public void ImpressiveRadioTest()
    {
        assertEquals(radioPage.ImpressiveClick(),"You have selected Impressive");
    }

    @Test
    public void NoRadioTest()
    {
        Assert.assertFalse(radioPage.NoClick());
    }

}
