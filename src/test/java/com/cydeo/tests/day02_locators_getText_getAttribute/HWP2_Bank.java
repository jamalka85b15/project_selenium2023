package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP2_Bank {  public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("http://zero.webappsecurity.com/login.html");
    String actual=driver.findElement(By.tagName("h3")).getText();
    if(actual.equals("Log in to ZeroBank")){
        System.out.println("Passed");
    }else{
        System.out.println("Falied");
    }
    driver.close();

}
}