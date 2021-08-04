package Tests;

import Pages.ButtonsPage;
import Pages.Config;
import Pages.RadioPage;
import org.junit.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.BeforeClass;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TestRadioPage

{
    public static WebDriver driver;
    public static RadioPage radioPage;
    public static ButtonsPage buttonsPage;
    @BeforeClass
    public static void setup()
    {
        System.setProperty("webdriver.chrome.driver", Config.getProperty("chromedriver"));

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get(Config.getProperty("radioPage"));

        radioPage = new RadioPage(driver);
        buttonsPage = new ButtonsPage(driver);
    }

    @Test
    public void YesRadioTest()
{
    assertEquals(radioPage.YesClick(),"You have selected Yes");
}


    @Test
    public void ImpressiveRadioTest()
    {
        driver.navigate().refresh();
        assertEquals(radioPage.ImpressiveClick(),"You have selected Impressive");
    }

    @Test
    public void NoRadioTest()
    {
        driver.navigate().refresh();
        Assert.assertFalse(radioPage.NoClick());
    }



}
