package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.assertEquals;

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

    public void oneClick ()
    {
        clickButton.click();
        assertEquals(message.getText(),"You have done a dynamic click");
    }

    public void RightClick ()
    {
        actions.contextClick(rightClickButton).perform();
        assertEquals(rightClickMessage.getText(),"You have done a right click");
    }

    public void DoubleClick ()
    {
        actions.doubleClick(doubleClickButton).perform();
        assertEquals(doubleClickMessage.getText(),"You have done a double click");
    }
}
