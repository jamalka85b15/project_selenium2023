package com.cydeo.tests.day10_upload_actions_jsExecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class T2_UploadTest {

   /* @BeforeMethod
    public void setupDriver(){
        WebDriver driver;
        driver= WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));

    }
    @AfterMethod
    public void tearDownMethod(){

       // Driver.closeDriver();

    }*/
    @Test
            public void test1(){
        WebDriver driver;
        driver= WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));


        Driver.getDriver().get(ConfigurationReader.getProperty("uploadURL"));
        Driver.getDriver().findElement(By.name("file")).sendKeys("C:\\Users\\optim\\Desktop\\New folder\\Helllo Jama.txt");
        Driver.getDriver().findElement(By.id("file-submit")).click();

        System.out.println(Driver.getDriver().findElement(By.id("uploaded-files")).getText());

        Assert.assertTrue( Driver.getDriver().findElement(By.tagName("h3")).isDisplayed());


        Driver.closeDriver();

    }


}
