package pageobjects.screens;

import locators.HomeScreenConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.base.BaseScreen;
import setup.WaitUtils;

public class HomeScreen extends BaseScreen {
    private final By homeButton = By.xpath(HomeScreenConstants.HOME_BUTTON);
    private final By zenith = By.xpath(HomeScreenConstants.ZENITH);
    private final By vhernierMilano = By.xpath(HomeScreenConstants.vhernierMilano);

    public void clickHomeButton() {
        WebElement home = WaitUtils.getInstance().waitForElementToBeClickable(homeButton);
        click(home);
    }

    public void clickOnZenith() {
        WebElement zenithImage = WaitUtils.getInstance().waitForElementToBeClickable(zenith);
        click(zenithImage);
    }

    public void clickOnVhernierMilano() {
        WebElement vMilano = WaitUtils.getInstance().waitForElementToBeClickable(vhernierMilano);
        click(vMilano);
    }
}
