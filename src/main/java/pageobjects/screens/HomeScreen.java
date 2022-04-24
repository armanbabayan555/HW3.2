package pageobjects.screens;

import locators.HomeScreenConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.base.BaseScreen;

public class HomeScreen extends BaseScreen {
    private final By zenith = By.xpath(HomeScreenConstants.ZENITH);
    private final By vhernierMilano = By.xpath(HomeScreenConstants.vhernierMilano);

    public void clickOnZenith() {
        WebElement zenithImage = driver.findElement(zenith);
        scrollToElement(zenithImage);
        click(zenithImage);
    }

    public void clickOnVhernierMilano() {
        WebElement vhernierImage = driver.findElement(vhernierMilano);
        scrollToElement(vhernierImage);
        click(vhernierImage);
    }
}
