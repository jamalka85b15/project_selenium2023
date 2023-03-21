package com.cydeo.tests.day05_testNg_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T4_TestNG_Selenium_Intro {
WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.cydeo.com");
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }
    @Test
    public void test1_cydeo_title_verification(){

        String expectedTitle="Cydeo";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }
}
