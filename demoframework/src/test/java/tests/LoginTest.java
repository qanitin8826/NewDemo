package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import pages.*;
import BaseTest.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaseTest
{

    public LoginTest() throws Exception {
        super();
    }

    @BeforeMethod
    public  void before() throws IOException {
        super.before();
        getDriver().manage().window().maximize();
    }

    @Test(priority = '0')
    public void signUp() throws Exception {
        System.out.println("Login");

        LoginPage loginPage = new LoginPage();
        CreateAccountPage createAccountPage = loginPage.createAccountSignIn();
        createAccountPage.createAnAccount();
    }

    @Test(priority = '1')
    public void loginToApplication() throws Exception {
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = loginPage.signInToAccount();
        Assert.assertTrue(myAccountPage.getMyAccountHeading().isDisplayed(),
                "My account heading is not displayed");
    }

    @Test(priority = '2')
    public void navigateToHomePage(){
    }

    @Test(priority = '2')
    public void navigateToOrderHistory() throws Exception {
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = loginPage.signInToAccount();
        OrderHistoryPage orderHistoryPage = myAccountPage.navigateToOrderHistoryPage();
        Assert.assertTrue(orderHistoryPage.getOrderHistoryHeading().isDisplayed(),
                "History heading is not displayed.");
    }

    @Test(priority = '2')
    public void navigateToMyCreditSlips() throws Exception {
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = loginPage.signInToAccount();
        MyCreditSlipsPage myCreditSlipsPage = myAccountPage.navigateToMyCreditSlipsPage();
        Assert.assertTrue(myCreditSlipsPage.getMyCreditSlipsHeading().isDisplayed(),
                "My Credits Slips heading is noy displayed.");
    }

    @Test(priority = '2')
    public void navigateToMyAddressesPage() throws Exception {
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = loginPage.signInToAccount();
        MyAddressesPage myAddressesPage = myAccountPage.navigateToMyAddressesPage();
        Assert.assertTrue(myAddressesPage.getMyAddressesHeading().isDisplayed(),
                "My addresses heading is not displayed.");
    }

    @Test(priority = '2')
    public void navigateToMyPersonalInfoPage() throws Exception {
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = loginPage.signInToAccount();
        MyPersonalInformationPage myPersonalInformationPage = myAccountPage.navigateToMyPersonalInfoPage();
        Assert.assertTrue(myPersonalInformationPage.getPersonalInfoHeading().isDisplayed(),
                "My personal info heading is not displayed.");
    }

    @Test(priority = '2')
    public void navigateToMyWishListsPage() throws Exception {
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = loginPage.signInToAccount();
        MyWishListsPage myWishListsPage = myAccountPage.navigateToMyWishListsPage();
        Assert.assertTrue(myWishListsPage.getWishlistsHeading().isDisplayed(),
                "My wishlists is not displayed.");
    }








}
