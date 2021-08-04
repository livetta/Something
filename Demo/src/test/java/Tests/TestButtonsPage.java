package Tests;

import Pages.ButtonsPage;
import Pages.Config;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TestButtonsPage
{
    public static WebDriver driver;

    public static ButtonsPage buttonsPage;
    @BeforeClass
    public static void setup()
    {
        System.setProperty("webdriver.chrome.driver", Config.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(Config.getProperty("buttonsPage"));
        buttonsPage = new ButtonsPage(driver);
    }

    @Test
    public void ClickButtonTest()
    {
        assertEquals(buttonsPage.oneClick(),"You have done a dynamic click");
    }
}
