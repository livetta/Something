package com.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.Color;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;

import static org.junit.Assert.*;

public class DynamicPropertiesPage extends BasePage
{

    public DynamicPropertiesPage(WebDriver driver)
    {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver,5);

    @FindBy (id = "enableAfter")
    WebElement button;

    @FindBy (id = "visibleAfter")
    WebElement buttonVisibleAfter;

    @FindBy (id = "colorChange")
    WebElement colorChangeButton;

    public void CheckIdOfTheText()
    {
        WebElement textWithRandomId = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/p"));
        String str =textWithRandomId.getAttribute("id");
        driver.navigate().refresh();
        WebElement textWithRandomIdR = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/p"));
        String str1 =textWithRandomIdR.getAttribute("id");
        System.out.println(str +"   "+str1);
        assertNotSame(str, str1);
    }

    public void CheckClickableButton()
    {
        if (!button.isEnabled())
        {
        wait.until(ExpectedConditions.elementToBeClickable(button));
        assertTrue(button.isEnabled());
        }
    }

    public void CheckDisplayedAfterButton()
    {
        if (!buttonVisibleAfter.isDisplayed())
        {
            wait.until(ExpectedConditions.invisibilityOf(buttonVisibleAfter));
            assertTrue(buttonVisibleAfter.isDisplayed());
        }
    }

    WebElement colorAfterButton;

    public void CheckColorChangeButton() {

            String color = colorChangeButton.getCssValue("color");
            String hex = Color.fromString(color).asHex();
            System.out.println(hex);
            wait.until(ExpectedConditions.visibilityOf(colorAfterButton = driver.findElement(By.xpath("//*[@class='mt-4 text-danger btn btn-primary']"))));

            String color1 = colorAfterButton.getCssValue("color");
            String hex1 = Color.fromString(color1).asHex();
            System.out.println(hex1);
            assertNotEquals(hex,hex1);
    }

}
