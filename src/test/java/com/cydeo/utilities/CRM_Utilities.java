package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    public static void crm_login(WebDriver driver) {
        WebElement userName= driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("helpdesk1@cydeo.com");
        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("UserUser");
        WebElement button=driver.findElement(By.xpath("//input[@type='submit']"));
        button.click();

    }

    public static void crm_login(WebDriver driver, String username, String psw) {
        WebElement userName= driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys(username);
        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys(psw);
        WebElement button=driver.findElement(By.xpath("//input[@type='submit']"));
        button.click();

    }
}
