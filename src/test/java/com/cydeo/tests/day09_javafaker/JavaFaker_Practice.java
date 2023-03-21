package com.cydeo.tests.day09_javafaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker_Practice {

    @Test
    public void teat1(){
        Faker faker=new Faker();
        String firstName=faker.name().firstName();
        System.out.println(firstName);
        System.out.println(faker.name().lastName());
        System.out.println(faker.name().fullName());
        System.out.println(faker.numerify("###-##-##-##"));
        System.out.println(faker.address().city());
        System.out.println(faker.address().zipCode());
        String id=faker.bothify("#-???").toUpperCase();
        System.out.println(id);
    }
}
