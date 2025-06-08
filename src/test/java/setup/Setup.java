package setup;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Setup {
    protected  static AndroidDriver driver;


    @BeforeClass
    public void setup() throws MalformedURLException {
        if (driver == null) {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appium:platformVersion", "14");
            capabilities.setCapability("appium:deviceName", "Android Device");
            capabilities.setCapability("appium:automationName", "UiAutomator2");
            capabilities.setCapability("appium:app", "E:\\MyBankDemo.apk");
            capabilities.setCapability("appium:appPackage", "cf.projectspro.bank");
            capabilities.setCapability("appium:appActivity", "cf.projectspro.bank.ui.activities.SplashScreen");

            URL url = new URL("http://127.0.0.1:4723/");
            driver = new AndroidDriver(url, capabilities);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }
    @AfterSuite
    public void quitApp() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static AndroidDriver getDriver() {
        return driver;
    }
}
