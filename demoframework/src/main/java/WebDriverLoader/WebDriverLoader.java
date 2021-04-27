package WebDriverLoader;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class WebDriverLoader {

    private static final Logger LOGGER = Logger.getLogger(WebDriverLoader.class);



    private boolean isFirefox(String driverType) {
        return "firefox".equalsIgnoreCase(driverType);
    }

    private WebDriver loadFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "C:geckodriver-v0.23.0-win64geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    private boolean isChrome(String driverType) {
        return "chrome".equals(driverType);
    }

    private WebDriver loadChromeDriver() {
        String currentUsersHomeDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", currentUsersHomeDir+"\\src\\test\\java\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public WebDriver loadWebDriver(String driverType) {
        LOGGER.debug("requested load of webdriver: " + driverType);
        WebDriver driver;
        if (isFirefox(driverType)) {
            driver = loadFirefoxDriver();
        } else {
            if (isChrome(driverType)) {
                driver = loadChromeDriver();
            } else {

                throw new IllegalArgumentException(
                        "Sorry, " + driverType
                                + " is not supported yet");
            }
        }
        return driver;
    }

    private void setDefaultTimeout(WebDriver driver, int timeout, TimeUnit timeUnit) {
        driver.manage().timeouts().implicitlyWait(timeout, timeUnit);
    }



}
