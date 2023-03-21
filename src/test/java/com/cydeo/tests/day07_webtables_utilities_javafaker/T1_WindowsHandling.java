package com.cydeo.tests.day07_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class T1_WindowsHandling {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com");
    }

    @AfterMethod
    public void tearDownMethod() {
        //driver.quit();
    }

    @Test
    public void test1() {

        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com', '_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com', '_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com', '_blank');");


        Set<String> allWindows = driver.getWindowHandles();
        for (String each : allWindows) {

            driver.switchTo().window(each);
            System.out.println("Current URL = " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains("etsy")) {
                break;
            }
        }
            String  actualTitle=driver.getTitle();
            String expectedTitle="Etsy";
            Assert.assertTrue(actualTitle.contains(expectedTitle));

/*
            String arr[] = new String[allWindows.size()];
            arr = allWindows.toArray(arr);
            String google = arr[1];
            String etsy = arr[2];
            String facebook = arr[3];
            driver.switchTo().window(etsy);
            String etsyTitle = driver.getTitle();
            Assert.assertTrue(etsyTitle.contains("Etsy"), "Not Etsy");
*/

        }

    @Test
    public void test2() {

        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com', '_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com', '_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com', '_blank');");
        BrowserUtils.switchWindowAndVerify(driver, "etsy", "Etsy");



    }
    }

