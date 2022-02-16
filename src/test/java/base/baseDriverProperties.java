package base;

public class baseDriverProperties {
    public static void FirefoxProperties() {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 || os.indexOf("aix") > 0) {
            System.setProperty("webdriver.gecko.driver", ".src/main/java/resources/drivers/geckodriver-linux");
        } else {
            System.out.println("System loading geckodriver");
            System.setProperty("webdriver.gecko.driver", ".src/main/java/resources/drivers/geckodriver.exe");
        }

    }

    public static void ChromeProperties() {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 || os.indexOf("aix") > 0) {
            System.setProperty("webdriver.chrome.driver", ".src/main/java/resources/drivers/chromedriver");
        } else {
            System.out.println("System loading chromedriver");
            System.setProperty("webdriver.chrome.driver", ".src/main/java/resources/drivers/chromedriver.exe");
        }

    }

        public static void EdgeProperties() {
            String os = System.getProperty("os.name").toLowerCase();

            if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 || os.indexOf("aix") > 0) {
                System.out.println("Edge Driver is no available to run on other operating system");
            } else {
                System.out.println("System loading Edge Driver");
                System.setProperty("webdriver.edge.driver", "./src/test/resources/drivers/msedgedriver.exe");
            }

    }
}
