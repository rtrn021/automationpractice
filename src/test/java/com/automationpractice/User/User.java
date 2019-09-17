package com.automationpractice.User;

import com.github.javafaker.Faker;

public class User {
    Faker faker=new Faker();
    public String customerfirstname=faker.name().firstName();
    public String customerlastname=faker.name().lastName();
    public String password=faker.internet().password();
    public String firstname=faker.name().firstName();
    public String lastname=faker.name().lastName();
    public String company=faker.company().name();
    public String address1=faker.address().streetAddress();
    public String city=faker.address().cityName();
    public String postcode=faker.address().zipCode().substring(0,5);
    public String phone_mobile=faker.phoneNumber().cellPhone();
    public String alias=faker.address().streetAddress();
    public String email=faker.internet().emailAddress();



    public User(){

    }

}
