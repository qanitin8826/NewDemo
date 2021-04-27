package tests;

import BaseTest.BaseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyAccountPage;

import java.io.IOException;

public class CartOperations extends BaseTest
{

    public CartOperations() throws Exception {
        super();
    }

    @BeforeMethod
    public  void before() throws IOException {
        super.before();
        getDriver().manage().window().maximize();
    }

    @Test(priority = '2')
    public void navigateToItemsPage() throws Exception{

        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = loginPage.signInToAccount();
        myAccountPage.getTshirtsOption().click();



    }




}
