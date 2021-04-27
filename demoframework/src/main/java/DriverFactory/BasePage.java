package DriverFactory;

import BaseTest.BaseTest;
import com.sun.webkit.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage extends BaseTest{

    public static WebDriverWait wait;

    public void waitForPageToLoad(WebPage pageName, String frameID){



    }

    //Click Method
    public void click(By elementLocation) {
        waitVisibility(elementLocation);
        driver.findElement(elementLocation).click();
    }

    //Write Text
    public void writeText(By elementLocation, String text) {
        waitVisibility(elementLocation);
        driver.findElement(elementLocation).sendKeys(text);
    }

    //Read Text
    public String readText(By elementLocation) {
        waitVisibility(elementLocation);
        return driver.findElement(elementLocation).getText();
    }

    //Wait
    public void waitVisibility(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }


    public boolean isExist(int timeout, By by){
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try
        {
            driver.findElement(by);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
        finally
        {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

    }

}
