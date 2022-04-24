package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {
    public static final Duration MAX_DURATION = Duration.ofSeconds(10);

    public static WaitUtils getInstance() {
        return new WaitUtils();
    }

    public WebElement waitForElementToBeClickable(By by) {
        try {
            return new WebDriverWait(DriverUtils.getDriver(), MAX_DURATION).until(ExpectedConditions.elementToBeClickable(by));
        } catch (WebDriverException ignored) {
            throw new Error("The Element with the name '" + by + "' could not be found");
        }
    }

    public boolean waitForElementToBeVisible(By by) {
        try {
            new WebDriverWait(DriverUtils.getDriver(), MAX_DURATION).until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (WebDriverException ignored) {
            throw new Error("The Element with the name '" + by + "' could not be found");
        }
    }

}
