package base;

public class baseDriverProperties {
    public static void FirefoxProperties() {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 || os.indexOf("aix") > 0) {
            System.setProperty("webdriver.gecko.driver", "za.co.quirc.insurance/src/test/resources/drivers/geckodriver/geckodriver-linux");
        } else {
            System.out.println("System loading geckodriver");
            System.setProperty("webdriver.gecko.driver", "za.co.quirc.insurance/src/test/resources/drivers/geckodriver/geckodriver.exe");
        }

    }

    public static void ChromeProperties() {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 || os.indexOf("aix") > 0) {
            System.setProperty("webdriver.chrome.driver", "/quirc-test-framework/za.co.quirc.insurance/src/test/resources/drivers/chromedriver/chromedriver");
        } else {
            System.out.println("System loading chromedriver");
            System.setProperty("webdriver.chrome.driver", "/quirc-test-framework/za.co.quirc.insurance/src/test/resources/drivers/chromedriver/chromedriver.exe");
        }

    }

    public static void InternetExplorerProperties() {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 || os.indexOf("aix") > 0) {
            System.out.println("Internet Explore Driver is no available to run on other operating system");
        } else {
            System.out.println("System loading InternetExploredDriver");
            System.setProperty("webdriver.ie.driver", "./src/test/resources/drivers/iedriver/IEDriverServer.exe");
        }

    }
}
