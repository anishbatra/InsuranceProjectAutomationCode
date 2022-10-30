package com.insurance.WebPages;

import com.insurance.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BaseClass {


    @FindBy(how = How.XPATH,using="//input[@id='email']")
    WebElement loginEmail;
    @FindBy(how = How.XPATH,using="//input[@id='password']")
    WebElement password;
    @FindBy(how=How.NAME,using="submit")
    WebElement loginButton;
    @FindBy(how = How.XPATH,using = "//input[@value=\"Log out\"]")
    WebElement logoutButton;
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    public void userEntersEmail()  {
        loginEmail.click();
        loginEmail.sendKeys("quick@gmail.com");
    }
    public void userEntersPassword(){
        password.click();

        password.sendKeys("quick1234");
    }
    public void userClicksLoginButton(){
        loginButton.click();
    }
    public void validateLogOutButton(){
        Assert.assertTrue(logoutButton.isEnabled());
    }
}
