package com.cydeo.tests.day10_upload_actions_jsExecuter;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_ScrollTest {
    @Test
    public void test(){
        WebDriver driver;
        driver= WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        Driver.getDriver().get("https://practice.cydeo.com/");
        WebElement text=Driver.getDriver().findElement(By.linkText("CYDEO"));
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(text).perform();
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP).perform();

       // Driver.closeDriver();



    }}
