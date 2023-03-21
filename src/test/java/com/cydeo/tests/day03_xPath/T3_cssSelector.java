package com.cydeo.tests.day03_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_cssSelector { public static void main(String[] args) {
    WebDriver driver= WebDriverFactory.getDriver("Chrome");
    driver.get("https://login1.nextbasecrm.com/");
    String expectedLogin="Log In";
    WebElement actualLogin= driver.findElement(By.cssSelector("input[type='submit']"));
    String actualLoginText=actualLogin.getAttribute("value");
    System.out.println(actualLoginText);
    if(actualLoginText.equals(expectedLogin)){
        System.out.println("Passed");
    }else{
        System.out.println("Failed");
    }
    driver.close();
}
}