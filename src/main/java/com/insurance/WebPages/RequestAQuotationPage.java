package com.insurance.WebPages;

import com.insurance.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RequestAQuotationPage extends BaseClass {

    public RequestAQuotationPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.XPATH,using = "//div[@aria-expanded=\"true\"]/h2")
    WebElement header;
    @FindBy(how = How.XPATH,using = "//label[@for=\"quotation_policyexcess\"]")
    WebElement policyExcess;
    @FindBy(how = How.XPATH,using = "//select[@id=\"quotation_breakdowncover\"]/option")
    List<WebElement> breakDownCoverOptions;
    @FindBy(how = How.XPATH,using = "//input[@name=\"windscreenrepair\"]")
    List<WebElement> windScreenRepairOptions;
@FindBy(how = How.ID,using = "quotation_incidents")
    WebElement quotationIncidents;
    @FindBy(how = How.ID,using = "quotation_vehicle_attributes_registration")
    WebElement registration;
    @FindBy(how = How.ID,using = "quotation_vehicle_attributes_mileage")
    WebElement vehicleMileage;
    @FindBy(how = How.ID,using = "quotation_vehicle_attributes_value")
    WebElement vehicleValue;
    @FindBy(how = How.XPATH,using = "//select[@name=\"parkinglocation\"]/option")
    List<WebElement> parkingLocationOptions;
    @FindBy(how = How.XPATH,using = "//select[@name=\"year\"]")
    WebElement year;
    @FindBy(how = How.XPATH,using = "//select[@name=\"month\"]")
    WebElement month;
    @FindBy(how = How.XPATH,using = "//select[@name=\"date\"]")
    WebElement date;
    @FindBy(how = How.XPATH,using = "//input[@value=\"Calculate Premium\"]")
    WebElement calculatePremiumButton;


}
