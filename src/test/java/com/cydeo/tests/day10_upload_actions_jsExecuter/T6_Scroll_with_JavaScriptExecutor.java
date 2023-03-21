package com.cydeo.tests.day10_upload_actions_jsExecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Test;

public class T6_Scroll_with_JavaScriptExecutor {
    @Test
    public void test(){
        WebDriver driver;
        driver= WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");
        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();

        for (int i = 0; i <10 ; i++) {
           // BrowserUtils.sleep(2);
            js.executeScript("window.scrollBy(0,750)");
        }
        for (int i = 0; i <10 ; i++) {
            //BrowserUtils.sleep(2);
            js.executeScript("window.scrollBy(0,-750)");
        }
        driver.quit();

    }
}
