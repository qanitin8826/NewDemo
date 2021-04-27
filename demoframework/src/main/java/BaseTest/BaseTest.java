package BaseTest;

import PropertyFileLoader.PropertyFileLoader;
import WebDriverLoader.WebDriverLoader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import java.io.IOException;


public class BaseTest extends PropertyFileLoader {

    public static WebDriver driver;
    WebDriverLoader webDriverLoader = new WebDriverLoader();


    public void before() throws IOException {
        this.driver = setDriver();
        getDriver().get(getApplicationURL());
    }

    public WebDriver createWebDriver() throws IOException {
        return webDriverLoader.loadWebDriver(getDriverType());
    }


    public WebDriver getDriver(){
        return driver;
    }

    public WebDriver setDriver() throws IOException {
     return createWebDriver();
    }

    @AfterMethod
    public void quitDriver(){
        getDriver().quit();
    }

}
