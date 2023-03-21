package com.cydeo.tests.day02_locators_getText_getAttribute;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T1_CydeoVerifications {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cydeo.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String actualdURL = driver.getCurrentUrl();
        if (actualdURL.contains("cydeo")) {
            System.out.println("Its Cydeo");
        }
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Practice")) {
            System.out.println("Bingo");
        }

        driver.close();
    }
}

