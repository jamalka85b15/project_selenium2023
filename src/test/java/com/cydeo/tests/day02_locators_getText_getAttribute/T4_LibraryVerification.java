package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryVerification {public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://library2.cybertekschool.com/login.html");
    WebElement emailLibrary=driver.findElement(By.className("form-control"));
    emailLibrary.sendKeys("Incorrect@email.com");
    WebElement pswLibrary=driver.findElement(By.id("inputPassword"));
    pswLibrary.sendKeys("incorrect password");
    WebElement signInBtn=driver.findElement(By.tagName("button"));
    signInBtn.click();
}
}