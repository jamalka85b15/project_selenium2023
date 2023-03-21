package com.cydeo.tests.day07_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;

public class T4_Crm_Login_Task {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://login1.nextbasecrm.com/");
    }
    @AfterMethod
    public void tearDownMethod(){
        //driver.quit();
    }
    @Test
    public void test1(){
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("helpdesk1@cydeo.com");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser");
driver.findElement(By.xpath("//input[@type='submit']")).click();
        BrowserUtils.verifyTitle(driver,"Portal");
    }
    @Test
    public void test2(){
        CRM_Utilities.crm_login(driver);
        BrowserUtils.verifyTitle(driver,"Portal");
    }
    @Test
    public void test3(){
        CRM_Utilities.crm_login(driver, "helpdesk1@cydeo.com", "UserUser");
        BrowserUtils.verifyTitle(driver,"Portal");
    }
}
