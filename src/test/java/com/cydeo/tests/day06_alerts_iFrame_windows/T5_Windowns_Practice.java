package com.cydeo.tests.day06_alerts_iFrame_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;
;

public class T5_Windowns_Practice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/windows");
    }
    @AfterMethod
    public void tearDownMethod(){
        //driver.quit();
    }
    @Test
    public void test1() {

        Assert.assertEquals(driver.getTitle(), "Windows");
        String mainHandle=driver.getWindowHandle();
        System.out.println(mainHandle);
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: "+driver.getTitle());
        }
        String expectedTitleAfterClick="New Window";
        String actual=driver.getTitle();
        //Assert.assertEquals(expectedTitleAfterClick,actual);
        System.out.println("Before main handle switched "+driver.getTitle());
        driver.switchTo().window(mainHandle);
        System.out.println("After main handle switched "+driver.getTitle());


    }}

