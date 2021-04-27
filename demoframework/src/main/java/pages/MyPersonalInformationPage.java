package pages;

import DriverFactory.DriverFactory;
import org.openqa.selenium.WebElement;

public class MyPersonalInformationPage extends DriverFactory{

    public static final String myPersonalInformationHeading = "//h1[contains(text(),'Your personal information')]";

    public WebElement getPersonalInfoHeading(){
        return findElementByXpath(myPersonalInformationHeading);
    }

}
