package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    public static String returnOrderDate(WebDriver driver, String consumerName){
        String locator="//td[.='"+consumerName+"']//following-sibling::td[3]";
        WebElement orderDate=driver.findElement(By.xpath(locator));
        return orderDate.getText();


    }

    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate){
        String locator="//td[.='"+customerName+"']//following-sibling::td[3]";
        String orderDate=driver.findElement(By.xpath(locator)).getText();

        System.out.println(orderDate);
        Assert.assertEquals(orderDate,expectedOrderDate,"Order date doesn't match");

    }
}
