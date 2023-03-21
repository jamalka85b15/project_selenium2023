package com.cydeo.tests.day10_upload_actions_jsExecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.security.PublicKey;

public class T3_HoverTest {
    @Test
    public void test1(){
        WebDriver driver;
        driver= WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        Driver.getDriver().get(ConfigurationReader.getProperty("hoverURL"));
        WebElement img1=Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2=Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3=Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        WebElement text1=Driver.getDriver().findElement(By.xpath("(//h5)[1]"));
        WebElement text2=Driver.getDriver().findElement(By.xpath("(//h5)[2]"));
        WebElement text3=Driver.getDriver().findElement(By.xpath("(//h5)[3]"));
        Actions action=new Actions(Driver.getDriver());
        action.moveToElement(img1).perform();
        Assert.assertTrue(text1.isDisplayed());
        BrowserUtils.sleep(2);
        action.moveToElement(img2).perform();
        Assert.assertTrue(text2.isDisplayed());
        BrowserUtils.sleep(2);
        action.moveToElement(img3).perform();
        Assert.assertTrue(text3.isDisplayed());
        Driver.closeDriver();


    }
}
