package com.cydeo.tests.day11_explicitWait;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Undertsanding_closeDriver_method {
    WebDriver driver= WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
    @Test
    public void test1(){
        Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().close();
    }
    @Test
    public void test2(){
        Driver.getDriver().get("https://www.google.com");
    }
    @Test
    public void test3(){
        Driver.getDriver().get("https://www.google.com");
    }
}
