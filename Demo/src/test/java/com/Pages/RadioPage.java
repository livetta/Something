package com.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


    public String YesClick ()
    {
        YesRadioButton.click();
        return Textarea.getText();
    }


    public String ImpressiveClick ()
    {
        ImpressiveRadioButton.click();
        return Textarea.getText();
    }


    public boolean NoClick () {
        NoRadioButton.click();
        if (NoRadioButton.isSelected()){ return true;}
        else { return false; }
    }



}
