package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class LoginPage extends BasePage {

    //// Локаторы:

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy (id = "passwd")
    private WebElement passwordField;

    @FindBy (xpath = "//*[@id='SubmitLogin']/span/i")
    private WebElement SignInLogin;

    @FindBy (xpath = "//div[@class='alert alert-danger']/ol/li")
    private WebElement AllertMessage;


    public LoginPage (WebDriver driver) {
        super(driver);
    }


    public void openLoginPage() {
        open();
    }


    public void fillEmailAddress(String email){
        element(emailField).sendKeys(email);
    }

    public void fillPassword(String password){
        element(passwordField).sendKeys(password);
    }

    public void clickSignInLogin(){
        element(SignInLogin).click();
    }

    public void checkIfAlertMessageIsDisplayed(){
        Assert.assertTrue(element(AllertMessage).isDisplayed());
    }

    public void checkAlertMessageIsCorrect(String message){
        Assert.assertEquals(message, element(AllertMessage).getText());
    }

}
