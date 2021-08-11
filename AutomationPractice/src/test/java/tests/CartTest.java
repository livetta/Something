package tests;

import org.junit.Test;

public class CartTest extends SampleTest
{
    @Test
    public void AddItemInCartTest()
    {
        user.mainPage.openMainPage();
        user.myAccountPage.clickOnWomenTab();
        user.myAccountPage.addToCartClick();
        user.cartPage.AddToCartAndProceedToCheckout();
    }

    @Test
    public void AddItemAndContinueShopping()
    {
        user.mainPage.openMainPage();
        user.myAccountPage.clickOnWomenTab();
        user.myAccountPage.addToCartClick();
        user.cartPage.AddAndContinueShopping();
    }

    @Test
    public void  DeleteFromCart ()
    {
        user.mainPage.openMainPage();
        user.myAccountPage.clickOnWomenTab();
        user.myAccountPage.addToCartClick();
        user.cartPage.AddToCartAndProceedToCheckout();
        user.cartPage.DeleteFromCart();
        user.cartPage.alertMessageIsDisplayed();
    }
}
