package tests;

import org.junit.Test;

public class CartTest extends SampleTest
{
    @Test
    public void addItemInCartTest()
    {
        user.mainPage.openMainPage();
        user.myAccountPage.clickOnWomenTab();
        user.myAccountPage.addToCartClick();
        user.cartPage.addToCartAndProceedToCheckout();
    }

    @Test
    public void addItemAndContinueShopping()
    {
        user.mainPage.openMainPage();
        user.myAccountPage.clickOnWomenTab();
        user.myAccountPage.addToCartClick();
        user.cartPage.addAndContinueShopping();
    }

    @Test
    public void  deleteFromCart ()
    {
        user.mainPage.openMainPage();
        user.myAccountPage.clickOnWomenTab();
        user.myAccountPage.addToCartClick();
        user.cartPage.addToCartAndProceedToCheckout();
        user.cartPage.deleteFromCart();
        user.cartPage.checkAlertMessageIsDisplayed();
    }
}
