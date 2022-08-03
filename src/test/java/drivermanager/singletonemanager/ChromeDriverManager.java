package drivermanager.singletonemanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.PropertyManager;

import java.util.concurrent.TimeUnit;

public class ChromeDriverManager {

    private static ChromeDriverManager chromeDriverManager;
    public static WebDriver driver;

    private ChromeDriverManager() {
        String os = System.getProperty("os.name");
        String path = "PATH_TO_CHROME_WIN";
        if (!os.contains("Windows")) {
            path = "PATH_TO_CHROME_MAC";
        }
        PropertyManager propertyManager = new PropertyManager();
        propertyManager.loadData();
        System.setProperty("webdriver.chrome.driver", propertyManager.get(path));
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }

    public static ChromeDriverManager getInstanceOfChromeDriver() {
        if (chromeDriverManager == null) {
            chromeDriverManager = new ChromeDriverManager();
        }
        return chromeDriverManager;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static ChromeDriverManager quitDriver() {
        driver.quit();
        return chromeDriverManager;
    }

    public static ChromeDriverManager startBrouserMaximize() {
        driver.manage().window().maximize();
        return chromeDriverManager;
    }

    public static ChromeDriverManager setWait() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return chromeDriverManager;
    }

    public static ChromeDriverManager removeWait() {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        return chromeDriverManager;
    }




}
