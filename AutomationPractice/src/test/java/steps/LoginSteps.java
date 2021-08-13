package steps;

import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.LoginPage;

public class LoginSteps extends ScenarioSteps {


    private LoginPage onPage;

    @Step
    public void openMainPage() {
        onPage.openLoginPage();
    }

    @Step
    public void fillEmailAddress(String email){
        onPage.fillEmailAddress(email);
    }

    @Step
    public void fillPassword(String password){
        onPage.fillPassword(password);
    }

    @Step
    public void clickSignInLogin(){
        onPage.clickSignInLogin();
    }

    @Step
    public void checkIfAlertMessageIsDisplayed(){
        onPage.checkIfAlertMessageIsDisplayed();
    }

    @Step
    public void checkIfAlertMessageIsCorrect(String message){
        onPage.checkAlertMessageIsCorrect(message);
    }
}
