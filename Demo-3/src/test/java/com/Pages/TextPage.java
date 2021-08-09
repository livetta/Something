package com.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TextPage extends BasePage
{

    @FindBy(id = "userName")
    static WebElement userName;

    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "currentAddress")
    WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    WebElement permanentAddress;

    @FindBy(xpath = "//*[@id=\"output\"]/div")
    WebElement textSubmit;

    @FindBy(xpath = "//*[@id=\"userForm\"]/div[5]/div")
    WebElement submit;

    JavascriptExecutor jse = (JavascriptExecutor)driver;

    public TextPage(WebDriver driver) {
        super(driver);
    }

    public void InputUsername (String name)
    {
        userName.sendKeys(name);
        assertEquals(name,userName.getAttribute("value"));
    }

    public void InputEmail (String email)
    {
        userEmail.sendKeys(email);
        assertEquals(email,userEmail.getAttribute("value"));
    }

    public void InputCurrentAddress (String address)
    {
        currentAddress.sendKeys(address);
        assertEquals(address,currentAddress.getAttribute("value"));
    }

    public void InputPermanentAddress (String PermanentAddress)
    {
        permanentAddress.sendKeys(PermanentAddress);
        assertEquals(PermanentAddress,permanentAddress.getAttribute("value"));

    }

    public void Submit ()
    {
        InputUsername("Sherlok");
        InputEmail("Sherlok@example.com");
        InputCurrentAddress("Baker Street 221d");
        InputPermanentAddress("Baker Street 221d");
        jse.executeScript("window.scrollBy(0,250)", "");
        submit.click();
        assertTrue(textSubmit.isDisplayed());
    }
}
