package com;

import com.Pages.*;
import com.helpers.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class User
{
    public static ButtonsPage buttonsPage;
    public static RadioPage radioPage;
    public static TextPage textPage;
    public static CheckBoxPage checkBoxesPage;
    public static ElementsPage elementsPage;
    public static MainPage mainPage;
    public static LinksPage linksPage;
    public static DynamicPropertiesPage dynamicPage;
    public static WebDriver driver;
   public static ImagePage imagePage;
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver", Config.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get(Config.getProperty("mainPage"));
        mainPage = new MainPage(driver);
        elementsPage=new ElementsPage(driver);
        buttonsPage = new ButtonsPage(driver);
        textPage=new TextPage(driver);
        radioPage = new RadioPage(driver);
        checkBoxesPage = new CheckBoxPage(driver);
        dynamicPage =new DynamicPropertiesPage(driver);
        linksPage =new LinksPage(driver);
        imagePage =new ImagePage(driver);
    }


}
