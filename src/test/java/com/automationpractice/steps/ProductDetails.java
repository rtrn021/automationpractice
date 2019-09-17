package com.automationpractice.steps;

import com.automationpractice.Product.Dress;
import com.automationpractice.User.User;
import com.automationpractice.utils.BrowserUtils;
import com.automationpractice.utils.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ProductDetails {


    Pages pages=new Pages();
    String search_product;
    Dress dress_before_checkout;
    Dress dress_after_checkout;

    @Then("User logs in to account with user credentials")
    public void user_logs_in_to_account_with_user_credentials() {
        BrowserUtils.waitForClickability(pages.loginpage().submit);
        pages.loginpage().loginmail.sendKeys(Register.user.email);
        pages.loginpage().loginpassword.sendKeys(Register.user.password);
        pages.loginpage().submit.click();




    }

    @When("User Search for the {string}")
    public void user_Search_for_the(String searchfor) {
        BrowserUtils.waitForClickability(pages.myaccount().searchbutton);
        search_product=searchfor;
        pages.myaccount().search.sendKeys(search_product);
        pages.myaccount().searchbutton.click();
    }

    @When("User choose the product")
    public void user_choose_the_product() {
        pages.myaccount().clicktoproduct(search_product);
        dress_before_checkout=pages.productpage().getdetailsbeforecheckout();
        BrowserUtils.waitForClickability( pages.productpage().addtocart ).click();
        BrowserUtils.waitForClickability( pages.productpage().proceedtocheckout ).click();
        dress_after_checkout=pages.productpage().getdetailsaftercheckout();

    }

    @Then("User confirm the product details")
    public void user_confirm_the_product_details() {
        Assert.assertEquals(dress_before_checkout.name,dress_after_checkout.name);
        Assert.assertEquals(dress_before_checkout.size,dress_after_checkout.size);
        Assert.assertEquals(dress_before_checkout.color,dress_after_checkout.color);
    }
}
