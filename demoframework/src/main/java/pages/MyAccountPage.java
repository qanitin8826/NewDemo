package pages;

import DriverFactory.DriverFactory;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends DriverFactory{

    public static final String myAccount = "//h1[contains(text(),'My account')]";
    public static final String orderHistoryAndDetails = "//span[contains(text(),'Order history and details')]";
    public static final String myCreditSlips = "//span[contains(text(),'My credit slips')]";
    public static final String myAddresses = "//span[contains(text(),'My addresses')]";
    public static final String myPersonalInfo = "//span[contains(text(),'My personal information')]";
    public static final String myWishlists = "//span[contains(text(),'My wishlists')]";
    public static final String homepage = "//img[contains(@class,'logo img-responsive')]";
    public static final String tshirtsOption = "T-shirts";

    public WebElement getTshirtsOption() {
        return findElementByLinkText(tshirtsOption);
    }

    public WebElement getMyAccountHeading() {
        return findElementByXpath(myAccount);
    }

    public WebElement getOrderHistoryAndDetails() {
        return findElementByXpath(orderHistoryAndDetails);
    }

    public WebElement getMyCreditSlips() {
        return findElementByXpath(myCreditSlips);
    }

    public WebElement getMyAddresses() {
        return findElementByXpath(myAddresses);
    }

    public WebElement getMyPersonalInfo() {
        return findElementByXpath(myPersonalInfo);
    }

    public WebElement getMyWishlists() {
        return findElementByXpath(myWishlists);
    }

    public WebElement getHomepage() {
        return findElementByXpath(homepage);
    }

    public OrderHistoryPage navigateToOrderHistoryPage(){
        getOrderHistoryAndDetails().click();
        return new OrderHistoryPage();
    }

    public MyCreditSlipsPage navigateToMyCreditSlipsPage(){
        getMyCreditSlips().click();
        return new MyCreditSlipsPage();
    }

    public MyAddressesPage navigateToMyAddressesPage(){
        getMyAddresses().click();
        return new MyAddressesPage();
    }

    public MyPersonalInformationPage navigateToMyPersonalInfoPage(){
        getMyPersonalInfo().click();
        return new MyPersonalInformationPage();
    }

    public MyWishListsPage navigateToMyWishListsPage(){
        getMyWishlists().click();
        return new MyWishListsPage();
    }

    public HomePage navigateToHomePage(){
        getHomepage().click();
        return new HomePage();
    }


}


