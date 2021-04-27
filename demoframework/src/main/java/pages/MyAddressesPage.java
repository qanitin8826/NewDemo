package pages;

import DriverFactory.DriverFactory;
import org.openqa.selenium.WebElement;

public class MyAddressesPage extends DriverFactory{

    public static final String myAddressesSlipsHeading = "//h1[contains(text(),'My addresses')]";
    public static final String myAddress = "//ul[contains(@class,'last_item item box')]";
    public static final String updateButton = "//span[contains(text(),'Update')]";
    public static final String deleteButton = "//span[contains(text(),'Delete')]";

    public WebElement getMyAddressesHeading() {
        return findElementByXpath(myAddressesSlipsHeading);
    }

    public WebElement getMyAddress() {
        return findElementByXpath(myAddress);
    }

    public WebElement getUpdateButton(){
        return findElementByXpath(updateButton);
    }

    public WebElement getDeleteButton(){
        return findElementByXpath(deleteButton);
    }





}
