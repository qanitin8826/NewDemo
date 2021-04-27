package pages;

import DriverFactory.DriverFactory;
import org.openqa.selenium.WebElement;

public class MyWishListsPage extends DriverFactory{

    public static final String myWishlistsHeading = "//h1[contains(text(),'//h1[contains(text(),'My wishlists')]')]";

    public WebElement getWishlistsHeading(){
        return findElementByXpath(myWishlistsHeading);
    }
}
