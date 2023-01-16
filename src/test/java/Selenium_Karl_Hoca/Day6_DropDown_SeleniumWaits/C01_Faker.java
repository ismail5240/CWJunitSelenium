package Selenium_Karl_Hoca.Day6_DropDown_SeleniumWaits;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C01_Faker {

    //Faker değerler üretmek için Faker Class’ından bir obje üretir ve var olan metotları kullanırız.


    @Test
    public void fakerExample(){

        //Faker objesini olusturuyoruz
        Faker faker = new Faker();

        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.address().fullAddress());

    }
}
