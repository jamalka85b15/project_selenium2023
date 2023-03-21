package com.cydeo.tests.day09_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.sql.rowset.BaseRowSet;
import java.time.Duration;

public class T1_BingSesrch {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfigurationReader.getProperty("bingURL"));
    }
    @AfterMethod
    public void tearDownMethod() {
        //driver.quit();
    }
    @Test
    public void bingSearch(){
WebElement searchBox=driver.findElement(By.xpath("//textarea[@name='q']"));
BrowserUtils.sleep(2);
searchBox.sendKeys(ConfigurationReader.getProperty("searchKey")+ Keys.ENTER);
String actualTitle=driver.getTitle();
       // System.out.println(actualTitle);
String expectedTitle=ConfigurationReader.getProperty("searchKey")+ " - Search";
       // System.out.println(expectedTitle);
        Assert.assertTrue(actualTitle.equals(expectedTitle),"Title is wrong");

    }
}
