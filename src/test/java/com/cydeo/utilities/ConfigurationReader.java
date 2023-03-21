package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//in this class we'll create the re usable logic to read from config.properties files
public class ConfigurationReader {
    //Private so access is limited to the object
    //Statis-to make sue its created and loaded before everything else
    private static Properties properties = new Properties();

    //Open file in Java memory using FileInputStream
    static {

        try {
            //Open file using FileInputStream (open file)
            FileInputStream file = new FileInputStream("configuration.properties");
            //Load the properties object with file (load properties)
            properties.load(file);
            //clode file in the memory
            file.close();
        } catch (IOException e) {
            System.out.println("FILE NOT FOUND WITH GIVEN PATH");
            e.printStackTrace();
        }
    }

    //Create a utility method to use the object to read
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
}

    //Load properties file in Properties object


}
