package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class core extends baseDriver{
    public static Properties Repository = new Properties();
    public File f;
    public FileInputStream FI;

    public static WebElement getLocator(String locator) throws Exception {
        String locatorType = locator.split("~")[0];
        String locatorValue = locator.split("~")[1];

        if (locatorType.toLowerCase().equals("id"))
            return driver.findElement(By.id(locatorValue));
        else if (locatorType.toLowerCase().equals("name"))
            return driver.findElement(By.name(locatorValue));
        else if ((locatorType.toLowerCase().equals("classname"))
                || (locatorType.toLowerCase().equals("class")))
            return driver.findElement(By.className(locatorValue));
        else if ((locatorType.toLowerCase().equals("tagname"))
                || (locatorType.toLowerCase().equals("tag")))
            return driver.findElement(By.className(locatorValue));
        else if ((locatorType.toLowerCase().equals("linktext"))
                || (locatorType.toLowerCase().equals("link")))
            return driver.findElement(By.linkText(locatorValue));
        else if (locatorType.toLowerCase().equals("partiallinktext"))
            return driver.findElement(By.partialLinkText(locatorValue));
        else if ((locatorType.toLowerCase().equals("cssselector"))
                || (locatorType.toLowerCase().equals("css")))
            return driver.findElement(By.cssSelector(locatorValue));
        else if (locatorType.toLowerCase().equals("xpath"))
            return driver.findElement(By.xpath(locatorValue));
        else
            throw new Exception("Unknown locator type '" + locatorType + "'");
    }

    public static WebElement getWebElement(String locator) throws Exception {
        return getLocator(Repository.getProperty(locator));
    }

    public void init() throws IOException {
        loadPropertiesFile();
        System.out.println("Loaded Properties");
        selectBrowser(Repository.getProperty("browser"));
        implicitewait(30);
        driver.get(Repository.getProperty("url"));
    }

    public void loadPropertiesFile() throws IOException {
        // za.co.quirc.insurance
        f = new File(System.getProperty("user.dir") + "/src/main/resource/config.properties");
        System.out.println(f);
        FI = new FileInputStream(f);
        Repository.load(FI);

        f = new File(System.getProperty("user.dir") + "/src/main/java/pageLocator/search.properties");
        FI = new FileInputStream(f);
        Repository.load(FI);

        f = new File(System.getProperty("user.dir") + "/src/main/java/pageLocator/signup.properties");
        FI = new FileInputStream(f);
        Repository.load(FI);

    }
}
