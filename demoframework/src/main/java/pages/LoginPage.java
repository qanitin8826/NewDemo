package pages;

import BaseTest.BaseTest;
import DriverFactory.DriverFactory;
import PropertyFileLoader.PropertyFileLoader;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.IOException;

public class LoginPage extends DriverFactory{

    public static final String signInLink = "//a[contains(text(),'Sign in')]";
    public static final String createAccountEmailField = "email_create";
    public static final String createAccountButton = "SubmitCreate";
    public static final String usernameField = "identifierId";
    public static final String passwordField = "passwd";
    public static final String nextButton = "identifierNext";
    public static final String forgotEmailLink = "Forgot email?";
    public static final String createAccountLink = "Create Account";
    public static final String forgotPasswordLink = "Forgot your password?";
    public static final String emailIDSignIn = "email";
    public static final String signInButton = "SubmitLogin";

    public static final String emailId = "tested" + RandomString.make(5) + "@gmail.com";

    PropertyFileLoader propertyFileLoader = new PropertyFileLoader();

    public LoginPage() throws Exception {
        super();
    }

    public WebElement signInLink(){
        return findElementByXpath(signInLink);
    }

    public WebElement getCreateAccountEmailField(){
        return findElementByID(createAccountEmailField);
    }

    public WebElement getCreateAccountButton(){
        return  findElementByID(createAccountButton);
    }

    public WebElement getUserNameField(){
        return findElementByID(usernameField);
    }

    public WebElement getPasswordField(){
        return findElementByName(passwordField);
    }

    public WebElement getNextButton(){
        return findElementByID(nextButton);
    }

    public WebElement getForgotEmailLink(){
        return findElementByLinkText(forgotEmailLink);
    }

    public WebElement getCreateAccountLink(){
        return findElementByLinkText(createAccountLink);
    }

    public WebElement getEmailFieldIDSignIn() {
        return findElementByID(emailIDSignIn);
    }

    public WebElement getPasswordFieldSignIn() {
        return findElementByID(passwordField);
    }

    public WebElement getSignInButton() {
        return findElementByID(signInButton);
    }

    public CreateAccountPage createAccountSignIn() throws Exception {
        signInLink().click();
        Thread.sleep(10000);
        Assert.assertTrue(getCreateAccountButton().isDisplayed(),
                "Create account button is not displayed.");
        getCreateAccountEmailField().sendKeys(emailId);
        getCreateAccountButton().click();
        Thread.sleep(5000);
        return new CreateAccountPage();
    }

    public MyAccountPage signInToAccount() throws Exception {
        signInLink().click();
        Thread.sleep(5000);
        getEmailFieldIDSignIn().sendKeys(propertyFileLoader.getUserName());
        Thread.sleep(5000);
        getPasswordField().sendKeys(propertyFileLoader.getPassword());
        getSignInButton().click();
        return new MyAccountPage();

    }


}
