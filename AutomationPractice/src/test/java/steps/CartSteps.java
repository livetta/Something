package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CartPage;

public class CartSteps extends ScenarioSteps
{

    private CartPage page;


    @Step
    public void addToCartAndProceedToCheckout ()
    {
        page.addAndMoveToCart();
    }

    @Step
    public void addAndContinueShopping ()
    {
        page.addAndContinueShopping();
    }

    @Step
    public void clickOnCartButton()
    {
    page.openCartPage();
    }

    @Step
    public void deleteFromCart()
    {
       page.deleteFromCart();
    }

    @Step
    public void checkAlertMessageIsDisplayed(){
        page.checkAlertMessageIsDisplayed();
    }

}
