package com.Tests;

import com.Pages.ButtonsPage;
import com.Pages.RadioPage;
import com.helpers.Config;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public abstract class SampleTest
{
    public static WebDriver driver;
    public static ButtonsPage buttonsPage;
    public static RadioPage radioPage;

    public static void setup(String key)
    {
        System.setProperty("webdriver.chrome.driver", Config.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(Config.getProperty(key));
        radioPage = new RadioPage(driver);
        buttonsPage = new ButtonsPage(driver);

    }
}
