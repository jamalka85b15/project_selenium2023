package com.cydeo.tests.day03_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Locators_getText { public static void main(String[] args) {
    //WebDriverManager.chromedriver().setup();
    // WebDriver driver=new ChromeDriver();
    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.get("https://login1.nextbasecrm.com");
    WebElement login= driver.findElement(By.name("USER_LOGIN"));
    login.sendKeys("incorrect");
    WebElement password=driver.findElement(By.name("USER_PASSWORD"));
    password.sendKeys("incorrect");
    WebElement button=driver.findElement(By.className("login-btn"));
    button.click();
    String actualText=driver.findElement(By.className("errortext")).getText();
    String expected="Incorrect login or password";

    if(actualText.equals(expected)){
        System.out.println("Passed");
    }else{
        System.out.println("failed");
    }
    driver.close();



}
}