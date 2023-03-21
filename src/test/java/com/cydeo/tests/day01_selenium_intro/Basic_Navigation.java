package com.cydeo.tests.day01_selenium_intro;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Basic_Navigation {
    public static void main(String[] args) throws InterruptedException {

        //setup browser
        WebDriverManager.chromedriver().setup();
        //create instance of Chrome driver
        WebDriver driver = new ChromeDriver();
        //Go to Tesla.com
        driver.get("https://tesla.com");
        driver.manage().window().maximize();
        //Thread.sleep(3000);
        //use navigation back() to go back
        driver.navigate().back();

        //stop execution for 3 seconds
        //Thread.sleep(3000);

        //navigate forward() to go forward
        driver.navigate().forward();
        //Thread.sleep(3000);
        driver.navigate().refresh();
        driver.navigate().to("https://google.com");
        System.out.println("Title is: " + driver.getTitle());

        System.out.println("Current URL: " + driver.getCurrentUrl());
        driver.close();

    }
}

