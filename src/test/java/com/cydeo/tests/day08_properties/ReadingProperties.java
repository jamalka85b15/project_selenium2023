package com.cydeo.tests.day08_properties;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_test() throws IOException {
        //Create object of Properties
        Properties property=new Properties();
        //Open file in Java memory using FileInputStream
        FileInputStream file=new FileInputStream("configuration.properties");
        //Load properties file in Properties object
        property.load(file);
        ;
        System.out.println("browser = " +property.getProperty("browser"));
        System.out.println("username = " +property.getProperty("username"));
        System.out.println("password = " +property.getProperty("password"));
        System.out.println("password = " +property.getProperty("password"));


    }
}
