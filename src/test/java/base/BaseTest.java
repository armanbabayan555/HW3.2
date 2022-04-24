package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import setup.DriverUtils;

import java.io.File;
import java.io.IOException;

public abstract class BaseTest {

    @BeforeClass
    @Parameters("browser")
    public void remoteServerSetup(String browserName) {
        DriverUtils.setDriver(browserName);
    }


    @AfterMethod
    protected static void tearDown(ITestResult testResult) {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            var camera = (TakesScreenshot) DriverUtils.getDriver();
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("src/main/resources/snapshots" + testResult.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        DriverUtils.quitDriver();
    }


    @BeforeMethod
    public void startDriver() {
        DriverUtils.getDriver().get("https://chronograph.am/");
    }
}
