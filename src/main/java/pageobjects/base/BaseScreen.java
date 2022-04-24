package pageobjects.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static setup.DriverUtils.getDriver;

public abstract class BaseScreen {

    protected static WebDriver driver;
    protected Actions actions;
    protected final String homePage = "https://www.chronograph.am";

    public BaseScreen() {
        driver = getDriver();
        actions = new Actions(driver);
    }

    public void scrollToElement(WebElement element) {
        actions.moveToElement(element).perform();
    }

    public void click(WebElement element) {
        actions.click(element).perform();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }


}
