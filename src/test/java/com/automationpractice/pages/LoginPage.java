package com.automationpractice.pages;

import com.automationpractice.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#email_create")
    public WebElement createaccount;

    @FindBy(css = ".icon-user.left")
    public WebElement createaccountbutton;

    @FindBy(css = "#email")
    public WebElement loginmail;

    @FindBy(css = "#passwd")
    public WebElement loginpassword;

    @FindBy(css = ".icon-lock.left")
    public WebElement submit;


    public void login(String username,String password){
        loginmail.sendKeys(username);
        loginpassword.sendKeys(password);
        submit.click();
    }



}
