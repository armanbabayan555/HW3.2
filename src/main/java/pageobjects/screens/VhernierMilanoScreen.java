package pageobjects.screens;

import locators.VhernierMilanoScreenConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.base.BaseScreen;
import setup.WaitUtils;

public class VhernierMilanoScreen extends BaseScreen {

    private final By roseGoldBracelet = By.xpath(VhernierMilanoScreenConstants.ROSE_GOLD_BRACELET);
    private final By roseGoldEarrings = By.xpath(VhernierMilanoScreenConstants.ROSE_GOLD_EARRINGS);


    public boolean isRoseGoldEarringsPresent() {
        WebElement rgEarrings = driver.findElement(roseGoldEarrings);
        scrollToElement(rgEarrings);
        return WaitUtils.getInstance().waitForElementToBeVisible(roseGoldEarrings);
    }

    public boolean isRoseGoldBraceletPresent() {
        WebElement rgBracelet = driver.findElement(roseGoldBracelet);
        scrollToElement(rgBracelet);
        return WaitUtils.getInstance().waitForElementToBeVisible(roseGoldBracelet);
    }

}
