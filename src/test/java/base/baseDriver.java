package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.Reporter;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class baseDriver {

    public static WebDriver driver;
    public static WebDriver selectBrowser(String browser){
        if (browser.equals("firefox") || browser.equals("FIREFOX") || browser.equals("Firefox")) {
            baseDriverProperties.FirefoxProperties();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            return driver;
        } else if (browser.equals("chrome") || browser.equals("CHROME") || browser.equals("Chrome")) {
            baseDriverProperties.ChromeProperties();
            driver = new ChromeDriver();
//            driver.manage().window().maximize();
            return driver;
        } else if (browser.equals("ie") || browser.equals("IE") || browser.equals("Ie")) {
            baseDriverProperties.InternetExplorerProperties();
      //      DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
      //      caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
       //     caps.setCapability("nativeEvents", false);
        //    driver = new InternetExplorerDriver(caps);
            driver.manage().window().maximize();
            return driver;
        }
        return null;
    }

    public static void driverwait() throws InterruptedException {
        Reporter.log("waiting for 2 seconds...");
        Thread.sleep(7000);
    }

    public void implicitewait(int timeInsec) {
        Reporter.log("waiting for the page to load...");
        try {
            driver.manage().timeouts().implicitlyWait(timeInsec, TimeUnit.SECONDS);
            Reporter.log("Page is loaded");
        } catch (Throwable error) {
            Reporter.log("Timeout for Page to load request to complete after " + timeInsec + " seconds");
            Assert.assertTrue(false, "Timeout for page load request after " + timeInsec + " Second");
        }
    }
}
