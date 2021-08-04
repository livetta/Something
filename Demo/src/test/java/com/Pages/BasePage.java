package com.Pages;

import com.google.common.base.Predicate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
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
