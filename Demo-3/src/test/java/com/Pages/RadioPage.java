package com.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.assertEquals;

public class RadioPage extends BasePage
{
   @FindBy( xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]/label")
    WebElement YesRadioButton;

    @FindBy( id = "item-4")
    WebElement ToButtonPage;

    @FindBy( xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[1]/p")
    WebElement Textarea;

    @FindBy( xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]")
    WebElement ImpressiveRadioButton;

    @FindBy( xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[4]")
    WebElement NoRadioButton;

    public RadioPage(WebDriver driver) {
        super(driver);
    }

    public void YesClick ()
    {
        YesRadioButton.click();
        assertEquals(Textarea.getText(),"You have selected Yes");
    }

    public void ImpressiveClick ()
    {
        ImpressiveRadioButton.click();
        assertEquals(Textarea.getText(),"You have selected Impressive");
    }

    public void NoClick () {
        NoRadioButton.click();
        Assert.assertFalse(NoRadioButton.isSelected());
    }
}
