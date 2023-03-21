package com.cydeo.tests.day05_testNg_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T1_StaleElementReference {public static void main(String[] args) {
    WebDriver driver= WebDriverFactory.getDriver("firefox");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://practice.cydeo.com/add_remove_elements/");
    WebElement addElement=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
    addElement.click();
    WebElement deleteButton=driver.findElement(By.xpath("//button[@class='added-manually']"));
    System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
    deleteButton.click();
    try {
        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
    }catch (StaleElementReferenceException e){
        System.out.println("Element no longer on page");
    }
    driver.close();

}
}