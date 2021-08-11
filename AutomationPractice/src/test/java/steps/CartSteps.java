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
    public void AddToCartAndProceedToCheckout ()
    {
        page.AddAndMoveToCart();
    }

    @Step
    public void AddAndContinueShopping ()
    {
        page.AddAndContinueShopping();
    }

    @Step
    public void ClickOnCartButton()
    {
    page.openCartPage();
    }

    @Step
    public void DeleteFromCart()
    {
       page.DeleteFromCart();
    }

    @Step
    public void alertMessageIsDisplayed(){
        page.AlertMessage();
    }

}
