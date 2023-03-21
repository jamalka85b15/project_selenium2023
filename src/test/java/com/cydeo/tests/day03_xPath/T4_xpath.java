package com.cydeo.tests.day03_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_xpath { public static void main(String[] args) {
    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.get("https://login1.nextbasecrm.com/");
    //WebElement loginButton= driver.findElement(By.xpath("//input[@type='submit']"));
    WebElement loginButton= driver.findElement(By.xpath("//input[@value='Log In']"));

}
}