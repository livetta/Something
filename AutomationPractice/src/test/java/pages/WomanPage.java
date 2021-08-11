package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class WomanPage extends BasePage
{

    @FindBy (id="uniform-selectProductSort")
    WebElement sort;

    @FindBy (xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[2]/span")
    WebElement more;

    @FindBy (xpath="//*[@id=\"center_column\"]/div/div")
    WebElement information;

    @FindBy (xpath="//*[@id=\"center_column\"]/ul/li[1]")
    WebElement firstItem;

    @FindBy (xpath="//*[@id=\"center_column\"]/ul/li[2]")
    WebElement secondItem;

    @FindBy (xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[3]/div[2]/a")
    WebElement firstItemToCompare;

    @FindBy (xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div[3]/div[2]/a")
    WebElement secondItemToCompare;

    @FindBy (xpath="//*[@id=\"center_column\"]/div[3]/div[2]/form/button/span/strong")
    WebElement productsToCompare;

    @FindBy (id="grid")
    WebElement gridView;

    @FindBy (id="list")
    WebElement listView;

    @FindBy (id="search_query_top")
    WebElement searchArea;

    @FindBy (xpath="//*[@id=\"center_column\"]/h1/span[2]")
    WebElement searchResults;

    @FindBy (xpath="//*[@id=\"searchbox\"]/button")
    WebElement searchButton;

    @FindBy (xpath="//*[@id=\"center_column\"]/p")
    WebElement alertNoResults;


    public WomanPage(WebDriver driver) {
        super(driver);
    }

    public void SortProducts()
    {
        withAction().moveToElement(firstItem).perform();
        element(sort).click();
        element(sort).select().byValue("price:desc");
    }


    public void MoreAboutProduct()
    {
        withAction().moveToElement(firstItem).perform();
        withAction().moveToElement(sort).perform();
        element(more).click();
        Assert.assertTrue(information.isDisplayed());
    }

    public void AddToCompare()
    {
        withAction().moveToElement(firstItem).perform();
        element(firstItemToCompare).click();
        withAction().moveToElement(secondItem).perform();
        element(secondItemToCompare).click();
        waitForCondition().withTimeout(Duration.ofSeconds(30))
                .until(ExpectedConditions.textToBePresentInElement(productsToCompare,"2"));
        Assert.assertEquals(productsToCompare.getText(),"2");
    }

    public void ListView()
    {
        element(listView).click();
        Assert.assertEquals(listView.getAttribute("class"), "selected");
    }

    public void SearchFor(String s)
    {
        element(searchArea).click();
        element(searchArea).sendKeys(s);
        element(searchButton).click();
        Assert.assertTrue(searchResults.getText().contains(" been found."));
    }

    public void SearchForNotExistingItems(String s)
    {
        element(searchArea).click();
        element(searchArea).sendKeys(s);
        element(searchButton).click();
        Assert.assertTrue(alertNoResults.isDisplayed());
    }

}
