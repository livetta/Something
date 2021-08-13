package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.WomanPage;

public class WomanPageSteps extends ScenarioSteps
{
    private WomanPage page;


    @Step
    public void moreAboutProduct () {page.moreAboutProduct();}

    @Step
    public void sortByPrice() {page.sortProducts();}

    @Step
    public void compareTwoItems() {page.addToCompare();}

    @Step
    public void listView() {page.listView();}

    @Step
    public void searchForItem(String s) {page.searchForItem(s);}

    @Step
    public void searchForNotExistingItems(String s) {page.searchForNotExistingItems(s);}

}
