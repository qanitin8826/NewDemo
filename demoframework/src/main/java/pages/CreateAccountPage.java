package pages;

import DriverFactory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreateAccountPage extends DriverFactory {

    public static final String mrRadioButton = "#id_gender1";
    public static final String mrsRadioButton = "#id_gender2";
    public static final String firstNameField = "customer_firstname";
    public static final String lastNameField = "customer_lastname";
    public static final String emailIdField = "email";
    public static final String passwordField = "passwd";
    public static final String dateDropdown = "days";
    public static final String monthDropdown = "months";
    public static final String yearDropdown = "years";
    public static final String firstNameAddressField = "firstname";
    public static final String lastNameAddressField = "lastname";
    public static final String companyNameField = "company";
    public static final String addressField = "address1";
    public static final String cityField = "city";
    public static final String stateDropdown = "id_state";
    public static final String zipCodeField = "postcode";
    public static final String countryDropdown = "id_country";
    public static final String mobilePhoneField = "phone_mobile";
    public static final String registerButton = "submitAccount";
    public static final String addressAliasField = "alias";

    public CreateAccountPage() throws Exception {
        super();
    }

    public WebElement getMrRadioButton() {
        return findElementByCss(mrRadioButton);
    }

    public WebElement getMrsRadioButton() {
        return findElementByCss(mrsRadioButton);
    }

    public WebElement getEmailIdField() {
        return findElementByID(emailIdField);
    }

    public WebElement getFirstNameField() {
        return findElementByName(firstNameField);
    }

    public WebElement getLastNameField() {
        return findElementByName(lastNameField);
    }

    public WebElement getPasswordField() {
        return findElementByName(passwordField);
    }

    public WebElement getDateDropdown() {
        return findElementByName(dateDropdown);
    }

    public WebElement getMonthDropdown() {
        return findElementByName(monthDropdown);
    }

    public WebElement getYearDropdown() {
        return findElementByID(yearDropdown);
    }

    public WebElement getFirstNameAddressField() {
        return findElementByID(firstNameAddressField);
    }

    public WebElement getLastNameAddressField() {
        return findElementByID(lastNameAddressField);
    }

    public WebElement getCompanyNameField() {
        return findElementByID(companyNameField);
    }

    public WebElement getAddressField() {
        return findElementByName(addressField);
    }

    public WebElement getCityField() {
        return findElementByName(cityField);
    }

    public WebElement getStateDropdown() {
        return findElementByName(stateDropdown);
    }

    public WebElement getZipCodeField() {
        return findElementByName(zipCodeField);
    }

    public WebElement getCountryDropdown() {
        return findElementByName(countryDropdown);
    }

    public WebElement getMobilePhoneField() {
        return findElementByName(mobilePhoneField);
    }

    public WebElement getAddressAliasField() {
        return findElementByName(addressAliasField);
    }

    public WebElement getRegisterButton() {
        return findElementByName(registerButton);
    }


    public MyAccountPage createAnAccount() throws InterruptedException {
        getMrsRadioButton().click();
        getFirstNameField().sendKeys("tester");
        getLastNameField().sendKeys("tester");
        getPasswordField().sendKeys("tested@123");

        Select select = new Select(getDateDropdown());
        select.selectByValue("15");

        select = new Select(getMonthDropdown());
        select.selectByVisibleText("April ");

        select = new Select(getYearDropdown());
        select.selectByValue("1998");

        getCompanyNameField().sendKeys("test company");
        getAddressField().sendKeys("#17456, DC phase 2");
        getCityField().sendKeys("NEW DELHI");

        select = new Select(getStateDropdown());
        select.selectByVisibleText("Alaska");

        getZipCodeField().sendKeys("17456");

        select = new Select(getCountryDropdown());
        select.selectByVisibleText("United States");

        getMobilePhoneField().sendKeys("323-142-2244");
        getAddressAliasField().sendKeys("US");

        getRegisterButton().click();

        return new MyAccountPage();
    }



}
