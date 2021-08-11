package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("http://automationpractice.com/index.php")
public class MainPage extends BasePage{

    @FindBy(css = "a.login")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    private WebElement cartButton;


    @FindBy(xpath = "//*[@id=\"block_various_links_footer\"]/ul/li[7]/a")
    private WebElement aboutUsButton;

    @FindBy(id = "center_column")
    private WebElement aboutUs;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openMainPage() {
        open();
    }

    public void clickOnSignInButton() {
        element(signInButton).click();
    }

    public void clickOnCartInButton() {
        element(cartButton).click();
    }

    public void AboutUsButton() {
        element(aboutUsButton).click();
        Assert.assertTrue(aboutUs.isDisplayed());
    }

}
