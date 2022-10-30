package com.insurance.testCases;

import com.insurance.Base.BaseClass;
import com.insurance.WebPages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {

    LoginPage lp ;
    @Test
    public void userEntersEmail() throws InterruptedException {
        lp = new LoginPage();
        lp.userEntersEmail();
    }
    @Test
    public void userEntersPassword(){
        lp = new LoginPage();
        lp.userEntersPassword();
    }
    @Test
    public void userClicksOnLoginButton(){

        lp = new LoginPage();
        lp.userClicksLoginButton();
    }
    @Test
    public void userValidatesLogoutButton(){

        lp = new LoginPage();
        lp.validateLogOutButton();
    }
}
