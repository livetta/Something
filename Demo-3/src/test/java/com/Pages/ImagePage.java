package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class ImagePage extends BasePage
{

    public ImagePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath= "//*[@id=\"app\"]/div/div/div[2]/div/div[2]")
    WebElement checkElement1;

    @FindBy(xpath= "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/a[1]")
    WebElement validLink;

    @FindBy(xpath= "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/a[2]")
    WebElement brokenLink;

    @FindBy(xpath= "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/img[1]")
    WebElement image;

    @FindBy(xpath= "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/img[2]")
    WebElement image2;

    public void CheckValidLink()
    {
        validLink.click();
        assertTrue(checkElement1.isDisplayed());
    }

    public void CheckBrokenLink() throws IOException
    {
        brokenLink.click();
        URL target = new URL(driver.getCurrentUrl());
        HttpURLConnection con = (HttpURLConnection) target.openConnection();
        con.connect();
        int responseCode = con.getResponseCode();
        con.disconnect();
        assertEquals(500,responseCode);
    }

    public void CheckFirstImage()
    {
        assertTrue(Integer.parseInt(image.getAttribute("height"))>=100 && Integer.parseInt(image.getAttribute("width"))>=180);
    }

    public void CheckSecondImage()
    {
        assertFalse(Integer.parseInt(image2.getAttribute("height"))>=100 && Integer.parseInt(image2.getAttribute("width"))>=180);
    }

}
