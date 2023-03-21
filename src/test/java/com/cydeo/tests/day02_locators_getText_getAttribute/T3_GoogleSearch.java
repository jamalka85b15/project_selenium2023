package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch { public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://google.com");
    WebElement googleSearchBox=driver.findElement(By.name("q"));

    //Find search box and typed apple than click Enter
    googleSearchBox.sendKeys("apple"+ Keys.ENTER);
    //To press enter
    // googleSearchBox.sendKeys(Keys.ENTER);
    String expectedInBegginingTitle= "apple";
    String actualTitle=driver.getTitle();
    if(actualTitle.startsWith(expectedInBegginingTitle)){
        System.out.println("Passed");
    }else{
        System.out.println("Failed");
    }
    driver.close();


}
}