package com.cydeo.tests.day08_properties;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_Google_Search {

        WebDriver driver;
        @BeforeMethod
        public void setupMethod() {
            driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(ConfigurationReader.getProperty("GoogleURL"));
        }
        @AfterMethod
        public void tearDownMethod() {
            //driver.quit();
        }
        @Test
    public void googleSearch(){
           WebElement searchBox= driver.findElement(By.xpath("//input[@class='gLFyf']"));
            searchBox.sendKeys(ConfigurationReader.getProperty("searchKey")+ Keys.ENTER);
            String actualTitle=driver.getTitle();
            String expectedTitle="apple - Google Search";
            Assert.assertEquals(expectedTitle, actualTitle, "Title doesn't match");



    }
}
