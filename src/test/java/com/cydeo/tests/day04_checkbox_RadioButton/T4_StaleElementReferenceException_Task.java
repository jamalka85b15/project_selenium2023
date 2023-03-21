package com.cydeo.tests.day04_checkbox_RadioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T4_StaleElementReferenceException_Task {  public static void main(String[] args) {
    WebDriver driver= WebDriverFactory.getDriver("firefox");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://practice.cydeo.com/abtest");
    WebElement cydeoLink=driver.findElement(By.cssSelector("a[href='https://cydeo.com/']"));
    System.out.println(cydeoLink.isDisplayed());
    driver.navigate().refresh();
    cydeoLink=driver.findElement(By.cssSelector("a[href='https://cydeo.com/']"));
    System.out.println(cydeoLink.isDisplayed());
    driver.close();

}
}