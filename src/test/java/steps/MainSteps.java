package steps;

import pages.MainPages;

public class MainSteps extends ScenarioSteps {

    private MainPages onPages;

    @Step
    public void openMainPage() {
        onPages.openMainPage();
    }

    @Step
    public void clickOnSignButton() {
        onPages.clickOnSignButton();
    }




