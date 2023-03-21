package com.cydeo.tests.day06_alerts_iFrame_windows;

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

public class Dropdowns_T6_T7_T8 {
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
        Select yearDropdown=new Select(driver.findElement(By.id("year")));
        yearDropdown.selectByVisibleText("1933");
        String selectedYear=yearDropdown.getFirstSelectedOption().getText();


        Select monthDropdown=new Select(driver.findElement(By.id("month")));
        monthDropdown.selectByValue("11");
        String selectedMonth=monthDropdown.getFirstSelectedOption().getText();

        Select dayDropdown=new Select(driver.findElement(By.id("day")));
        dayDropdown.selectByIndex(0);
        String selectedDay=dayDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(selectedYear,"1933");
        Assert.assertEquals(selectedMonth,"December");
        Assert.assertEquals(selectedDay,"1");


    }
    @Test
    public void test2(){
        Select stateDropdown=new Select(driver.findElement(By.id("state")));
        stateDropdown.selectByVisibleText("Illinois");
        stateDropdown.selectByVisibleText("Virginia");
        stateDropdown.selectByVisibleText("California");
        String actualState=stateDropdown.getFirstSelectedOption().getText();
        String expectedState="California";
        Assert.assertEquals(expectedState,actualState, "Not correct option");
    }
@Test
    public void test3(){
        WebElement button=driver.findElement(By.id("dropdownMenuLink"));
        button.click();
    WebElement facebook =driver.findElement(By.cssSelector("a[href='https://www.facebook.com/']"));
    facebook.click();
    String actualtitle=driver.getTitle();
    String expectedTitle="Facebook - log in or sign up";
    Assert.assertEquals(expectedTitle,actualtitle,"Title are not equal");
}


}
