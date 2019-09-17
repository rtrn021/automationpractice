package com.automationpractice.steps;

import com.automationpractice.User.User;
import com.automationpractice.utils.BrowserUtils;
import com.automationpractice.utils.ConfigurationReader;
import com.automationpractice.utils.Driver;
import com.automationpractice.utils.Pages;
import com.github.javafaker.Faker;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Register {

        Faker faker=new Faker();
        public static User user=new User();
        Pages pages=new Pages();

    @Given("User is on homepage")
    public void user_is_on_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User register with an email")
    public void user_register_with_an_email() {
        pages.homepage().signinbutton.click();
        pages.loginpage().createaccount.sendKeys(user.email);
        pages.loginpage().createaccountbutton.click();
    }

    @And("User fill all required field and clicks to register")
    public void user_fill_all_required_field_and_clicks_to_register() {

        BrowserUtils.waitForClickability(pages.createaccountpage().Mr).click();
        pages.createaccountpage().customerfirstname.sendKeys(user.customerfirstname);
        pages.createaccountpage().customerlastname.sendKeys(user.customerlastname);
        pages.createaccountpage().password.sendKeys(user.password);
        pages.createaccountpage().firstname.sendKeys(user.firstname);
        pages.createaccountpage().lastname.sendKeys(user.lastname);
        pages.createaccountpage().company.sendKeys(user.company);
        pages.createaccountpage().address1.sendKeys(user.address1);
        pages.createaccountpage().city.sendKeys(user.city);
        pages.createaccountpage().selectstate("California");
        pages.createaccountpage().postcode.sendKeys(user.postcode);
        pages.createaccountpage().phone_mobile.sendKeys(user.phone_mobile);
        pages.createaccountpage().alias.sendKeys(user.alias);
        pages.createaccountpage().submitAccount.click();
    }

    @Then("User is registered")
    public void user_is_registered() {

        BrowserUtils.waitForClickability( pages.myaccount().signout);
        Assert.assertEquals("My account - My Store",Driver.getDriver().getTitle());
        pages.myaccount().signout.click();
    }
}
