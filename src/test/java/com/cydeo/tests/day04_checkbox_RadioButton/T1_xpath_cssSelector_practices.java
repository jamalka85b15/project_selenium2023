package com.cydeo.tests.day04_checkbox_RadioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practices {  public static void main(String[] args) throws InterruptedException {
    WebDriver driver= WebDriverFactory.getDriver("firefox");
    driver.get("https://practice.cydeo.com/forgot_password");
    //Home link
    WebElement homeButton=driver.findElement(By.cssSelector("a.nav-link"));
    //#2WebElement homeButton=driver.findElement(By.cssSelector("a[href='/']"));
    //#3WebElement homeButton=driver.findElement(By.cssSelector("a[class='nav-link]"));
    //"Forgot password" header
    WebElement h2Text=driver.findElement(By.cssSelector("h2"));
    h2Text.getText();
    //#2WebElement h2Text2=driver.findElement(By.xpath("//h2[.='Forgot Password']"));
    System.out.println(h2Text);
    //email input box
    WebElement inputEmail=driver.findElement(By.xpath("//input[@type='text']"));
    inputEmail.sendKeys("ABV");
    Thread.sleep(2000);
    //email text
    WebElement emailText=driver.findElement(By.cssSelector("label[for='email']"));
    emailText.getText();
    //#2WebElement emailText2=driver.findElement(By.xpath("//label[@for='email']"));
    //#3 WebElement emailText3=driver.findElement(By.xpath("//label[.='E-mail']"));
    System.out.println(emailText);
    //Retrieve password button
    WebElement retrievePsw1=driver.findElement(By.xpath("//button[@id='form_submit']"));
    // WebElement retrievePsw=driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
    retrievePsw1.click();
    //Powered by Cydeo text
    WebElement footerText=driver.findElement(By.cssSelector("div[style='text-align: center;']"));
    footerText.getText();
    System.out.println(footerText);

    System.out.println("Home: "+homeButton.isDisplayed());
    System.out.println("Header: "+h2Text.isDisplayed());
    System.out.println("Email text "+ emailText.isDisplayed());
    System.out.println("Email input "+inputEmail.isDisplayed());
    System.out.println("Retrieve: "+retrievePsw1.isDisplayed());
    System.out.println("Footer "+ footerText.isDisplayed());
    driver.close();
}
}