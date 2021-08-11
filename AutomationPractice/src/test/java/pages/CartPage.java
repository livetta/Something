package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

@DefaultUrl("http://automationpractice.com/index.php?controller=order")
public class CartPage extends BasePage
{

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    WebElement proceedToCheckout;

    @FindBy(id= "product_1_1_0_0")
    WebElement productInCart;

    @FindBy(xpath= "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
    WebElement continueShopping;

    @FindBy(xpath= "//*[@id=\"center_column\"]/ul")
    WebElement columnWithItems;

    @FindBy(id= "1_1_0_0")
    WebElement deleteButton;

    @FindBy(xpath= "/html/body/div/div[2]/div/div[3]/div/p")
    WebElement alertMessage;

    public CartPage(WebDriver driver)
    {
        super(driver);
    }

    public void AddAndMoveToCart()
    {
        proceedToCheckout.click();
        Assert.assertTrue(productInCart.isDisplayed());
    }

    public void openCartPage() {
        open();
    }

    public void AddAndContinueShopping()
    {
        continueShopping.click();
        Assert.assertTrue(columnWithItems.isDisplayed());
    }

    public void AlertMessage()
    {
       waitFor(alertMessage).waitUntilVisible();
        Assert.assertTrue(alertMessage.isDisplayed());
    }

    public void DeleteFromCart()
    {
        deleteButton.click();
    }
}
