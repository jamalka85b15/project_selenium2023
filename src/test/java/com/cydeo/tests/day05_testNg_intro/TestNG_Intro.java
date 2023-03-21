package com.cydeo.tests.day05_testNg_intro;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {
    @BeforeClass
    public void setupClass(){
        System.out.println("---->Before class is running...");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("---->After class is running...");
    }
   @BeforeMethod
    public void setupMentod(){
        System.out.println("---->Before method is running...");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("---->After method is running...");
    }

    @Test        // beacuse we added this annotation our code is runnable
    public void test1(){
        System.out.println("Test 1 is running...");
        String actual="apple";
        String expected="apple";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void test2(){
        System.out.println("Test 2 is running...");
        String actual="white";
        String expected="white";
        Assert.assertTrue(actual.equals(expected));
    }
}
