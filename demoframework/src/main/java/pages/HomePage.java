package pages;

import DriverFactory.DriverFactory;
import org.openqa.selenium.WebElement;

public class HomePage extends DriverFactory
{


    public static final String tshirtsOption = "T-shirts";

    public WebElement getTshirtsOption() {
        return findElementByLinkText(tshirtsOption);
    }
}
