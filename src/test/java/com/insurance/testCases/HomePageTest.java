package com.insurance.testCases;

import com.insurance.Base.BaseClass;
import com.insurance.WebPages.HomePage;
import com.insurance.WebPages.LoginPage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
    HomePage hp ;
    LoginPage lp;

    @Test
    public void verifyHomePageHeaderText(){
        lp=new LoginPage();
        hp = new HomePage();
        lp.userClicksLoginButton();
        hp.homePageHeaderText();

    }
    @Test
    public void clickOnRequestQuotation(){
        hp = new HomePage();
        hp.getTabsData();
    }
}
