package com.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage
{

    public ElementsPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(id = "item-4")
    WebElement buttons;

    @FindBy(id = "item-0")
    WebElement textField;

    @FindBy(id = "item-2")
    WebElement radioButtonPage;

    @FindBy(id = "item-1")
    WebElement checkBoxesPage;

    @FindBy(id = "item-8")
    WebElement toDynamicPage;

    @FindBy(id = "item-5")
    WebElement toLinksPage;

    @FindBy(id ="item-6")
    WebElement toImagePage;

    JavascriptExecutor jse = (JavascriptExecutor)driver;

    public void OpenButtonsPage ()
    {
        buttons.click();
    }
    public void OpenTextPage ()
    {
        textField.click();
    }
    public void OpenRadioPage ()
    {
        radioButtonPage.click();
    }
    public void OpenCheckBoxesPage ()
    {
        checkBoxesPage.click();
    }
    public void OpenLinksPage ()
    {
        toLinksPage.click();
    }
    public void OpenImagePage ()
    {
        toImagePage.click();
    }
    public void OpenDynamicPropertiesPage ()
    {
        jse.executeScript("window.scrollBy(0,300)", "");
        toDynamicPage.click();
        jse.executeScript("window.scrollBy(0,-250)", "");
    }

}
