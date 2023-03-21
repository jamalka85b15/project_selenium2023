package com.cydeo.tests.day10_upload_actions_jsExecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_RegistrationForm {
    @BeforeMethod
    public void setupDriver(){
        WebDriver driver;
        driver= WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));

    }
    @AfterMethod
    public void tearDownMethod(){

        Driver.closeDriver();

    }
    @Test
    public void test1(){
        Driver.getDriver().get(ConfigurationReader.getProperty("practiceURL"));
        Faker faker=new Faker();
        Driver.getDriver().findElement(By.name("firstname")).sendKeys(faker.name().firstName());
        Driver.getDriver().findElement(By.name("lastname")).sendKeys(faker.name().lastName());
        Driver.getDriver().findElement(By.name("username")).sendKeys(faker.bothify("??????????##"));
        Driver.getDriver().findElement(By.name("email")).sendKeys(ConfigurationReader.getProperty("email"));
        Driver.getDriver().findElement(By.name("password")).sendKeys(faker.letterify("?????????"));
        Driver.getDriver().findElement(By.name("phone")).sendKeys(faker.numerify("###-###-####"));
        WebElement gender=Driver.getDriver().findElement(By.name("gender"));
        gender.click();

        Driver.getDriver().findElement(By.name("birthday")).sendKeys(("07/30/1985")) ;
        Select office=new Select(Driver.getDriver().findElement(By.name("department")));
        office.selectByValue("MCTC");
        Select jobTitle=new Select(Driver.getDriver().findElement(By.name("job_title")));
        jobTitle.selectByVisibleText("SDET");
        BrowserUtils.sleep(3);
        Driver.getDriver().findElement(By.id("wooden_spoon")).click();
        WebElement actualText=Driver.getDriver().findElement(By.tagName("p"));
        Assert.assertTrue(actualText.isDisplayed());




    }
}
