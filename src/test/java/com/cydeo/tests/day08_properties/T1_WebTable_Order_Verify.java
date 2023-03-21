package com.cydeo.tests.day08_properties;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_WebTable_Order_Verify {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/web-tables");
    }
    @AfterMethod
    public void tearDownMethod(){
        //driver.quit();
    }
    @Test
    public void test1(){
        String locator="//table[@class='SampleTable']//tr[7]//td[2]";
        String nameOfCustomer=driver.findElement(By.xpath(locator)).getText();
        //String nameOfCustomer=driver.findElement(By.xpath("//table[@class='SampleTable']//tr[7]//td[2]"))
        String orderDate=driver.findElement(By.xpath("//table[@class='SampleTable']//tr[7]//td[2]//following-sibling::td[3]")).getText();
        String expectedName="Bob Martin";
        String expectedDate="12/31/2021";
        Assert.assertEquals(nameOfCustomer,expectedName,"Name doest match");
        Assert.assertEquals(orderDate,expectedDate, "Date is wrong");

    }
    @Test
    public void test2(){
        String SamuelJackson=WebTableUtils.returnOrderDate(driver, "Samuel Jackson");
        System.out.println(SamuelJackson);
    }
    @Test
    public void test3(){
        WebTableUtils.orderVerify(driver, "Samuel Jackson", "10/21/2021");

    }
}
