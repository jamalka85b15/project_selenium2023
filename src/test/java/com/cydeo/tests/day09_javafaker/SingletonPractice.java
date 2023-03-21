package com.cydeo.tests.day09_javafaker;

import org.testng.annotations.Test;

public class SingletonPractice {
    @Test
    public void test1(){
        String str=Singleton.getWord();
        System.out.println("str "+str);

        String str2=Singleton.getWord();
        System.out.println("str2 "+str2);

        String str3=Singleton.getWord();
        System.out.println("str2 "+str2);
    }
}
