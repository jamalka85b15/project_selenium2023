package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute { public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://practice.cydeo.com/registration_form");
    WebElement header=driver.findElement(By.tagName("h2"));
    String expectedText="Registration form";
    String actualText=header.getText();
    if(actualText.equals(expectedText)){
        System.out.println("Passed");
    }
    WebElement fNameInput=driver.findElement(By.className("form-control"));
    String expectedPlaceholder ="first name";
    String actual=fNameInput.getAttribute("placeholder");
    if(expectedPlaceholder.equals(actual)){
        System.out.println("Attribute passed");
    }
    driver.close();
}
}