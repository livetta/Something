package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage

{
    protected final WebDriver driver;

    public BasePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
}
