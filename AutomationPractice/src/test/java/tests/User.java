package tests;

import net.thucydides.core.annotations.Steps;
import steps.*;


public class User {

    @Steps
    public MainSteps mainPage;

    @Steps
    public LoginSteps loginPage;

    @Steps
    public MyAccountSteps myAccountPage;

    @Steps
    public CartSteps cartPage;

    @Steps
    public WomanPageSteps womanPage;
}
