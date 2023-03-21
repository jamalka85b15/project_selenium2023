package com.cydeo.tests.day06_alerts_iFrame_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_T2_T3_AlertsPractice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }
    @AfterMethod
    public void tearDownMethod(){
       driver.quit();
    }
    @Test
    public void test1(){
        WebElement jsAlertButton=driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        jsAlertButton.click();
        Alert alertButton=driver.switchTo().alert();
        alertButton.accept();
        WebElement resultMessage=driver.findElement(By.cssSelector("p[id='result']"));
        Assert.assertTrue(resultMessage.isDisplayed());
    }
    @Test
    public void test2(){
        WebElement confirmAlertButton=driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        confirmAlertButton.click();
        Alert alertButton=driver.switchTo().alert();
        alertButton.accept();
       WebElement actualTextResult=driver.findElement(By.cssSelector("p[id='result']"));
        Assert.assertTrue(actualTextResult.isDisplayed());

    }
    @Test
    public void test3(){
        WebElement promptAlertButton=driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        promptAlertButton.click();
        Alert alertButton=driver.switchTo().alert();
        alertButton.sendKeys("Hello");
        alertButton.accept();

        WebElement actualTextResult=driver.findElement(By.cssSelector("p[id='result']"));
        Assert.assertTrue(actualTextResult.isDisplayed(), "Result message not displayed");

    }

}
