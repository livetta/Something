package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.WomanPage;

public class WomanPageSteps extends ScenarioSteps
{
    private WomanPage Page;


    @Step
    public void MoreAboutProduct () {Page.MoreAboutProduct();}

    @Step
    public void SortByPrice() {Page.SortProducts();}

    @Step
    public void CompareTwoItems() {Page.AddToCompare();}

    @Step
    public void ListView() {Page.ListView();}

    @Step
    public void SearchFor(String s) {Page.SearchFor(s);}

    @Step
    public void SearchForNotExistingItems(String s) {Page.SearchForNotExistingItems(s);}

}
