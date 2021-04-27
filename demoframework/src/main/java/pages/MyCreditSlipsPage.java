package pages;

import DriverFactory.DriverFactory;
import org.openqa.selenium.WebElement;

public class MyCreditSlipsPage extends DriverFactory{

    public static final String myCreditSlipsHeading = "//h1[contains(text(),'Credit slips')]";

    public WebElement getMyCreditSlipsHeading() {
        return findElementByXpath(myCreditSlipsHeading);
    }
}
