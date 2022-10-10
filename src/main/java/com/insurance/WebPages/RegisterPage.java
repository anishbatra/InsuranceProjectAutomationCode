package com.insurance.WebPages;

import com.insurance.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class RegisterPage extends BaseClass {

    //Page Objects /Locators/Elements
    @FindBy(how = How.XPATH, using = "//a[text()='Register']")
    WebElement registerButton;
    @FindBy(how = How.XPATH, using = "//h1")
    WebElement header;
    @FindBy(how = How.XPATH, using = "//a[@href=\"index.php\"]")
    WebElement loginButton;
    @FindBy(how = How.NAME, using = "title")
    WebElement title;
    @FindBy(how = How.ID, using = "user_firstname")
    WebElement firstName;
    @FindBy(how = How.ID, using = "user_surname")
    WebElement surName;
    @FindBy(how = How.NAME, using = "phone")
    WebElement phone;
    @FindBy(how = How.NAME, using = "year")
    WebElement year;
    @FindBy(how = How.NAME, using = "month")
    WebElement month;
    @FindBy(how = How.NAME, using = "date")
    WebElement date;
    @FindBy(how = How.XPATH, using = "//label[text()=\"Provisional\"]")
    WebElement licenceType;
    @FindBy(how = How.ID, using = "user_licenceperiod")
    WebElement licencePeriod;
    @FindBy(how = How.NAME, using = "occupation")
    WebElement occupation;
    @FindBy(how = How.NAME, using = "street")
    WebElement street;

    @FindBy(how = How.NAME, using = "city")
    WebElement city;

    @FindBy(how = How.NAME, using = "county")
    WebElement country;
    @FindBy(how = How.NAME, using = "post_code")
    WebElement postalCode;
    @FindBy(how = How.NAME, using = "email")
    WebElement email;
    @FindBy(how = How.NAME, using = "password")
    WebElement password;
    @FindBy(how = How.NAME, using = "c_password")
    WebElement confirmPassword;
    @FindBy(how = How.XPATH, using = "//input[@name=\"submit\"]")
    WebElement createButton;
    @FindBy(how = How.XPATH, using = "//h3")
    WebElement loginHeader;


    //Initializing Page Factory
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickRegisterButton() {
        registerButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("register.php"));
        String text = header.getText();
        Assert.assertEquals(text, "Sign up as a new user");
        Assert.assertTrue(loginButton.isDisplayed());

    }

    public void selectTitle() {
        title.click();

        Select titleOption = new Select(title);
        titleOption.selectByValue("Doctor");
    }

    public void enterFirstName() {
        firstName.sendKeys("DemoName");


    }

    public void enterSurName() {
        surName.sendKeys("TestUser");


    }

    public void enterPhone() {
        phone.sendKeys("12345678");


    }

    public void enterYear() {
        year.click();
        Select yearOption = new Select(year);
        yearOption.selectByValue("1943");


    }

    public void enterMonth() {
        month.click();
        Select monthOption = new Select(month);
        monthOption.selectByValue("6");


    }

    public void enterDate() {
        date.click();
        Select dateOption = new Select(date);
        dateOption.selectByValue("16");


    }

    public void selectLicenceType() {
        licenceType.click();

    }

    public void selectLicencePeriod() {
        licenceType.click();
        Select licencePeriodOption = new Select(licencePeriod);
        licencePeriodOption.selectByValue("10");

    }

    public void selectOccupation() {
        occupation.click();
        Select occupationOption = new Select(occupation);
        occupationOption.selectByValue("14");

    }

    public void enterStreet() {
        street.sendKeys("golden street");


    }

    public void enterCity() {
        city.sendKeys("Toronto");


    }

    public void enterCountry() {
        country.sendKeys("Canada");


    }

    public void enterPostalCode() {
        postalCode.sendKeys("L1J9K4");


    }

    public void enterEmail() {
        email.sendKeys("ab@gmail.com");


    }

    public void enterPassword() {
        password.sendKeys("12345");


    }

    public void enterConfirmPassword() {
        confirmPassword.sendKeys("12345");


    }

    public void clickCreateButton() {
        createButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/v1/index.php"));
        String text = loginHeader.getText();
        Assert.assertEquals(text, "Login");


    }


}
