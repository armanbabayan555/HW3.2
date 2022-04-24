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

    public WebElement waitForElementToBeClickable(By location) {
        try {
            return new WebDriverWait(DriverUtils.getDriver(), MAX_DURATION).until(ExpectedConditions.elementToBeClickable(location));
        } catch (WebDriverException ignored) {
            throw new Error("Element with WebElement name '" + location + "' could not be found");
        }
    }


}
