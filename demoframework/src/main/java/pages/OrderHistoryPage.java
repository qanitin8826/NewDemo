package pages;

import DriverFactory.DriverFactory;
import org.openqa.selenium.WebElement;

public class OrderHistoryPage extends DriverFactory{

    public static final String orderHistoryHeading = "//h1[contains(text(),'Order history')]";

    public WebElement getOrderHistoryHeading() {
        return findElementByXpath(orderHistoryHeading);
    }

}
