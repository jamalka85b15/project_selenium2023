package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    //This class will be storing only the utility methods that can be used across the project.
/*
This methos will accept int (in seconds)
and execute Thread.sleep methos for given duration
Arg: int second
 */
    public static void sleep(int second){
        second*=1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }
    public static void switchWindowAndVerify(WebDriver driver, String expectedUrl, String expectedTitle){

        Set<String> allWindows = driver.getWindowHandles();
        for (String each : allWindows) {

            driver.switchTo().window(each);
            System.out.println("Current URL = " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedUrl)) {
                break;
            }
        }
        String  actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        String actualUrl=driver.getCurrentUrl();
        Assert.assertTrue( actualUrl.contains(expectedUrl));

    }

    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }
    public static void verrifyTitelContains(WebDriver driver, String expectedInTitle){
        Assert.assertTrue(driver.getTitle().contains(expectedInTitle));
    }


}
