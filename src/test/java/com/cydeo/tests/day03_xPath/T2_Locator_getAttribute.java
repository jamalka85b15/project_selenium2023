package com.cydeo.tests.day03_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class T2_Locator_getAttribute {  public static void main(String[] args) {
    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
    driver.get("https://login1.nextbasecrm.com/");
    String actualRemember=driver.findElement(By.className("login-item-checkbox-label")).getText();
    String expectedRemember="Remember me on this computer";
    if(actualRemember.equals(expectedRemember)){
        System.out.println("Passed: Remember me on this computer");
    }else{
        System.out.println("Failed");
    }


    String actualForgot =driver.findElement(By.className("login-link-forgot-pass")).getText();
    String expected= "FORGOT YOUR PASSWORD?";
    if(actualForgot.equals(expected)){
        System.out.println("Passed: Forgot your password?");
    }else{
        System.out.println("FTP: Failed");
    }

    String expectedAttribute="forgot_password=yes";
    String actualAttribute=driver.findElement(By.className("login-link-forgot-pass")).getAttribute("href");



    if(actualAttribute.contains(expectedAttribute)){
        System.out.println("Passed: Attribute testing");
    }else{
        System.out.println("href: Failed");
    }
    driver.close();




}
}