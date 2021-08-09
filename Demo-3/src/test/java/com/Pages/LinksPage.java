package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinksPage extends BasePage
{

    public LinksPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(id = "simpleLink")
    WebElement link1;

    @FindBy(id = "dynamicLink")
    WebElement link2;

    @FindBy(id = "created")
    WebElement link3;

    @FindBy(xpath= "//*[@id=\"app\"]/div/div/div[2]/div/div[2]")
    WebElement checkElement;

    @FindBy(xpath= "//*[@id=\"linkResponse\"]/b[1]")
    WebElement status;

    @FindBy(xpath= "//*[@id=\"linkResponse\"]/b[2]")
    WebElement statusText;

    public void CheckFirstLink()
    {
        link1.click();
        assertTrue(checkElement.isDisplayed());
    }

    public void CheckSecondLink()
    {
        link2.click();
        assertTrue(checkElement.isDisplayed());
    }

    public void CheckThirdLink()
    {
        link3.click();
        assertEquals("201",status.getText());
        assertEquals("Created",statusText.getText());
    }

}
