package com.insurance.WebPages;

import com.insurance.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage extends BaseClass {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH,using = "//div[@aria-expanded=\"true\"]/h2")
    WebElement homePageHeader;
    @FindBy(how = How.XPATH,using = "//a[@role=\"presentation\"]")
    List<WebElement> tabs;

    public void homePageHeaderText(){
         String text = homePageHeader.getText();
        Assert.assertEquals(text,"Broker Insurance WebPage");


    }
    public void getTabsData(){
        for(int i =0;i<tabs.size();i++){
            String text = tabs.get(i).getText();
            System.out.println(text);
            if(text == "Request Quotation"){
                tabs.get(i).click();
                break;
            }
        }
    }
}
