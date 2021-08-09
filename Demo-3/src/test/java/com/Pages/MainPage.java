package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage
{
    public MainPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]")
    WebElement toElementsPage;

    public void MoveToElementsPage()
    {
        toElementsPage.click();
    }
}
