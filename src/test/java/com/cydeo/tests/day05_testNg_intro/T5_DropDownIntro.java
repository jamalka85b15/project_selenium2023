package com.cydeo.tests.day05_testNg_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T5_DropDownIntro {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
       driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://practice.cydeo.com/dropdown");
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }
    @Test
    public void test1(){
        Select simpleDropDown=new Select(driver.findElement(By.id("dropdown")));
        String actualOption=simpleDropDown.getFirstSelectedOption().getText();
        String expectedOption="Please select an option";
        Assert.assertEquals(expectedOption,actualOption);

    }
    @Test
    public void test2(){
        Select simpleDropDown=new Select(driver.findElement(By.id("state")));
        String actualOption=simpleDropDown.getFirstSelectedOption().getText();
        String expectedOption="Select a State";
        Assert.assertEquals(expectedOption,actualOption);
    }


}
