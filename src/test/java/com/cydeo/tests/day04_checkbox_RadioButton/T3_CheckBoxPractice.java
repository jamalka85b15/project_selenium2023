package com.cydeo.tests.day04_checkbox_RadioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T3_CheckBoxPractice { public static void main(String[] args) {
    WebDriver driver= WebDriverFactory.getDriver("firefox");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://practice.cydeo.com/checkboxes");
    WebElement checkbox1=driver.findElement(By.cssSelector("input[id='box1']"));
    System.out.println("Check box1 selected: "+checkbox1.isSelected());
    checkbox1.click(); //Select checkbox
    //checkbox1.click(); //Unselect checkbox
    System.out.println("Check box1 selected: "+checkbox1.isSelected());
    System.out.println();
    WebElement checkbox2=driver.findElement(By.cssSelector("input[id='box2']"));
    System.out.println("Check box2 selected: "+checkbox2.isSelected());
    checkbox2.click();
    System.out.println("Check box2 selected: "+checkbox2.isSelected());
    driver.close();
}
}