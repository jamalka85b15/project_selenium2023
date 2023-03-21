package com.cydeo.tests.day09_javafaker;

public class Singleton {

    //#1Create private constructor
    //#2Private static String
    //#3Utility method to return the privateString we just created
    private Singleton() {

    }
    private static String word;

    public static String getWord(){
        if(word==null){
            System.out.println("First time call. Word object is null");
            System.out.println("Assigning value to it now");
            word="something";
        }else{
            System.out.println("Wrod already has a value");
        }return word;
    }
}
