package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage
{
    public WebDriver driver;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button")
    WebElement ClickButton;

    @FindBy( id = "rightClickBtn")
    WebElement RightClickButton;

    @FindBy( id = "doubleClickBtn")
    WebElement DoubleClickButton;

    @FindBy( id = "dynamicClickMessage")
    WebElement message;


    public ButtonsPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

public String oneClick ()
{
    ClickButton.click();
    return message.getText();
}





}
