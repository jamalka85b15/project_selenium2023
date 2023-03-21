package com.cydeo.tests.day04_checkbox_RadioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class T2_FindElements {  public static void main(String[] args) {
    WebDriver driver= WebDriverFactory.getDriver("firefox");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://practice.cydeo.com/abtest");
    driver.findElement(By.tagName("a"));
    List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
    System.out.println("List of links: "+listOfLinks.size());

    for (WebElement each : listOfLinks ) {
        System.out.println("Each element: "+each.getText());
        System.out.println("Href: "+ each.getAttribute("href"));
    }

    driver.close();

}
}