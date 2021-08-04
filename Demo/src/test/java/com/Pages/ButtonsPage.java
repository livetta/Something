package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage extends BasePage
{
    Actions actions = new Actions(super.driver);

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button")
    WebElement clickButton;

    @FindBy( id = "rightClickBtn")
    WebElement rightClickButton;

    @FindBy( id = "doubleClickBtn")
    WebElement doubleClickButton;

    @FindBy( id = "dynamicClickMessage")
    WebElement message;

    @FindBy( id = "rightClickMessage")
    WebElement rightClickMessage;

    @FindBy( id = "doubleClickMessage")
    WebElement doubleClickMessage;

    public ButtonsPage(WebDriver driver)
    {
        super(driver);

    }


    public String oneClick ()
    {
    clickButton.click();
    return message.getText();
    }


    public String RightClick ()
    {
        actions.contextClick(rightClickButton).perform();
        return rightClickMessage.getText();
    }

    public String DoubleClick ()
    {
        actions.doubleClick(doubleClickButton).perform();
        return doubleClickMessage.getText();
    }
}
