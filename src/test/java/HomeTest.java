import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.screens.HomeScreen;

public class HomeTest extends BaseTest {

    @Test
    public void isZenithOpen() {
        HomeScreen homeScreen = new HomeScreen();
        homeScreen.clickOnZenith();
        String url = "https://chronograph.am/en/brand/zenith";
        Assert.assertEquals(homeScreen.getCurrentUrl(), url, "Zenith page did not open.");
    }
}
