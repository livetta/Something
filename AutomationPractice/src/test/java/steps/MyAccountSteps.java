package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.MyAccountPage;

public class MyAccountSteps extends ScenarioSteps {


    private MyAccountPage onPage;

    @Step
    public void myAccountNameIsTrue(String accountName) {
        onPage.myAccountNameIsTrue(accountName);
    }

    @Step
    public void clickOnWomenTab() {
        onPage.clickOnWomenTab();
    }

    @Step
    public void signOutButtonIsVisible() {
        onPage.signOutButtonIsVisible();
    }
    @Step
    public void signOutButtonIsClickable() {
        onPage.signOutButtonIsClickable();
    }

    @Step
    public void addToCartClick() {
        onPage.addToCartClick();
    }


}
