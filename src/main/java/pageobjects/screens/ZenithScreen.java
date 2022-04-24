package pageobjects.screens;

import locators.ZenithScreenConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.base.BaseScreen;
import setup.WaitUtils;

public class ZenithScreen extends BaseScreen {

    private final By blueWatch = By.xpath(ZenithScreenConstants.BLUE_WATCH);
    private final By titaniumWatch = By.xpath(ZenithScreenConstants.TITANIUM_WATCH);

    public boolean isBlueWatchPresent() {
        WebElement bWatch = driver.findElement(blueWatch);
        scrollToElement(bWatch);
        return WaitUtils.getInstance().waitForElementToBeVisible(blueWatch);
    }

    public boolean isTitaniumWatchPresent() {
        WebElement tWatch = driver.findElement(titaniumWatch);
        scrollToElement(tWatch);
        return WaitUtils.getInstance().waitForElementToBeVisible(titaniumWatch);
    }
}
