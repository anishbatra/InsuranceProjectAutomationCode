package com.insurance.Base;

import com.insurance.utilities.ReadConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
    public static WebDriver driver;
    ReadConfig readConfig = new ReadConfig();


    public String baseUrl = readConfig.getApplicationURL();


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(baseUrl);

    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
