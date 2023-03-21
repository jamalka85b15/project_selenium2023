package com.cydeo.tests.day06_alerts_iFrame_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_iFramePractice {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/iframe");

    }

    @AfterMethod
    public void tearDownMethod() {
        //driver.quit();
    }

    @Test
    public void test1() {
        //#1driver.switchTo().frame(0);
        driver.switchTo().frame("mce_0_ifr"); //#2
        WebElement text = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        Assert.assertTrue(text.isDisplayed());
        driver.switchTo().parentFrame();
        WebElement parenText = driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        Assert.assertTrue(parenText.isDisplayed());
    }

}
