package com.orangehrm.utilities;

import com.github.javafaker.Faker;

public class RandomDataUtility {
    public static Faker faker;
    public static String getFirstName(){
        faker=new Faker();
        String firstName=faker.name().firstName();
        return firstName;
    }
    public static String getLastName(){
        faker=new Faker();
        String lastName=faker.name().lastName();
        return lastName;
    }
    public static String getEmail()
    {
        faker=new Faker();
        String email=faker.internet().emailAddress();
        return email;
    }
    public static String getPhoneNumber()
    {
        faker=new Faker();
        String phoneNumber=faker.phoneNumber().phoneNumber();
        return phoneNumber;
    }
    public static String getAddress()
    {
        faker=new Faker();
        String address=faker.address().streetAddress();
        return address;
    }
    public static String getCity()
    {
        faker=new Faker();
        String city=faker.address().city();
        return city;
    }
    public static String getState()
    {
        faker=new Faker();
        String state=faker.address().state();
        return state;
    }
    public static String getPostalCode()
    {
        faker=new Faker();
        String postalCode=faker.address().zipCode();
        return postalCode;
    }
    public static String getPassword()
    {
        faker=new Faker();
        String password=faker.internet().password();
        return password;
    }
    public static String getZipCode()
    {
        faker=new Faker();
        String zipCode = faker.address().zipCode();
        return zipCode;
    }
}
