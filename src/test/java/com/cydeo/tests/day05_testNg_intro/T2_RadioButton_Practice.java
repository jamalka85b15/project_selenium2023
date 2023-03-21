package com.cydeo.tests.day05_testNg_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T2_RadioButton_Practice { public static void main(String[] args) {
    WebDriver driver= WebDriverFactory.getDriver("firefox");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://practice.cydeo.com/radio_buttons");
    WebElement hoketRadioButton=driver.findElement(By.cssSelector("input#hockey"));
    hoketRadioButton.click();
    if(hoketRadioButton.isSelected()) {
        System.out.println("hoketRadioButton = Selected");
    }else{
        System.out.println("hoketRadioButton = Not selected");
    }
    driver.close();


}
}