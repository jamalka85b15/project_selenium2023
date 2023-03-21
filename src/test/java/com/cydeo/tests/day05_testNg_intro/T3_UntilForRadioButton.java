package com.cydeo.tests.day05_testNg_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class T3_UntilForRadioButton {    public static void main(String[] args) {


    WebDriver driver = WebDriverFactory.getDriver("firefox");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://practice.cydeo.com/radio_buttons");


    clickAndVerifyRadioButton(driver,"sport", "football");
    clickAndVerifyRadioButton(driver,"color", "red");

}



    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String expectedID) {

        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        for (WebElement each : radioButtons) {
            String actualId = each.getAttribute("id");


            if (actualId.equals(expectedID)) {
                each.click();
                System.out.println(actualId + " is selected " + each.isSelected());
                break;
            }



        }
    }
}