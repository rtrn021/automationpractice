package com.automationpractice.pages;

import com.automationpractice.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(css = ".login")
        public WebElement signinbutton;




}
