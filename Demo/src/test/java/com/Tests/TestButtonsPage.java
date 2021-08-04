package com.Tests;

import com.Pages.ButtonsPage;
import com.helpers.Config;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TestButtonsPage extends SampleTest
{

    @BeforeClass
    public static void set()
    {
        SampleTest.setup("buttonsPage");
    }

    @Test
    public void ClickButtonTest()
    {
        assertEquals(buttonsPage.oneClick(),"You have done a dynamic click");
    }

    @Test
    public void RightClickButtonTest()
    {
        assertEquals(buttonsPage.RightClick(),"You have done a right click");
    }

    @Test
    public void DoubleClickButtonTest()
    {
        assertEquals(buttonsPage.DoubleClick(),"You have done a double click");
    }


}
