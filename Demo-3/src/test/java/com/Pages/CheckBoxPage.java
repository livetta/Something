package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckBoxPage extends BasePage
{

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/span/label")
    WebElement SelectHome;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/span/button")
    WebElement OpenHome;


    @FindBy(xpath = "//*[@id=\"tree-node\"]/div/button[1]")
    WebElement expandAll;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/div/button[2]")
    WebElement hideAll;

    public CheckBoxPage(WebDriver driver)
    {
        super(driver);
    }

    public void SelectFolderHome()
    {
        SelectHome.click();
        OpenHome.click();
        for (WebElement checkbox : driver.findElements(By.className("rct-checkbox")))
        {
            assertFalse(checkbox.isSelected());
        }

    }

    public void ExpandAll()
    {
        expandAll.click();
        assertTrue(driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol")).isDisplayed());
    }

    public void HideAll()
    {
        expandAll.click();
        hideAll.click();
        assertFalse(OpenHome.isSelected());
    }

}
