import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.screens.HomeScreen;
import pageobjects.screens.VhernierMilanoScreen;
import pageobjects.screens.ZenithScreen;

public class Tests extends BaseTest {

    // Interacts with HomePage and Zenith page
    @Test
    public void verifyBlueWatchBeingPresentInZenith() {
        HomeScreen homeScreen = new HomeScreen();
        ZenithScreen zenithScreen = new ZenithScreen();
        homeScreen.clickOnZenith();
        Assert.assertTrue(zenithScreen.isBlueWatchPresent(), "Blue watch was not present.");
    }

    // Interacts with HomePage and Zenith page
    @Test
    public void verifyTitaniumWatchBeingPresentInZenith() {
        HomeScreen homeScreen = new HomeScreen();
        ZenithScreen zenithScreen = new ZenithScreen();
        homeScreen.clickOnZenith();
        Assert.assertTrue(zenithScreen.isTitaniumWatchPresent(), "Titanium watch was not present.");
    }

    // Interacts with the Home page and Vhernier Milano page (more than one)
    @Test
    public void verifyRoseGoldBraceletBeingPresentInVhernierMilano() {
        HomeScreen homeScreen = new HomeScreen();
        VhernierMilanoScreen vhernierMilanoScreen = new VhernierMilanoScreen();
        homeScreen.clickOnVhernierMilano();
        Assert.assertTrue(vhernierMilanoScreen.isRoseGoldBraceletPresent(), "Rose Gold bracelet was not present.");
    }

    // Interacts with the Home page and Vhernier Milano page (more than one)
    @Test
    public void verifyRoseGoldEarringsBeingPresentInVhernierMilano() {
        HomeScreen homeScreen = new HomeScreen();
        VhernierMilanoScreen vhernierMilanoScreen = new VhernierMilanoScreen();
        homeScreen.clickOnVhernierMilano();
        Assert.assertTrue(vhernierMilanoScreen.isRoseGoldEarringsPresent(), "Rose Gold earrings were not present.");
    }

    // Interacts with the Home page, Vhernier Milano page, and Zenith page (all POMs)
    @Test
    public void verifyWatchAndBraceletBeingPresent() {
        HomeScreen homeScreen = new HomeScreen();
        VhernierMilanoScreen vhernierMilanoScreen = new VhernierMilanoScreen();
        ZenithScreen zenithScreen = new ZenithScreen();
        homeScreen.clickOnZenith();
        Assert.assertTrue(zenithScreen.isTitaniumWatchPresent(), "Zenith page did not open.");
        zenithScreen.clickBackButton();
        homeScreen.clickOnVhernierMilano();
        Assert.assertTrue(vhernierMilanoScreen.isRoseGoldEarringsPresent(), "Vhernier Milano page did not open.");
        vhernierMilanoScreen.clickBackButton();
        Assert.assertEquals(homeScreen.getCurrentUrl(), "https://chronograph.am/", "Home page did not open.");
    }
}
