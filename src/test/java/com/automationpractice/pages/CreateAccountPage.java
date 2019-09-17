package com.automationpractice.pages;

import com.automationpractice.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

    public CreateAccountPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#id_gender1")
    public WebElement Mr;

    @FindBy(css = "#id_gender1")
    public WebElement Mrs;

    @FindBy(css = "#customer_firstname")
    public WebElement customerfirstname;

    @FindBy(css = "#customer_lastname")
    public WebElement customerlastname;

    @FindBy(css = "#passwd")
    public WebElement password;

    @FindBy(css = "#firstname")
    public WebElement firstname;

    @FindBy(css = "#lastname")
    public WebElement lastname;

    @FindBy(css = "#company")
    public WebElement company;

    @FindBy(css = "#address1")
    public WebElement address1;

    @FindBy(css = "#address2")
    public WebElement address2;

    @FindBy(css = "#city")
    public WebElement city;

    @FindBy(css = "#postcode")
    public WebElement postcode;

    @FindBy(css = "#other")
    public WebElement other;

    @FindBy(css = "#phone_mobile")
    public WebElement phone_mobile;

    @FindBy(css = "#alias")
    public WebElement alias;

    @FindBy(css = "#submitAccount")
    public WebElement submitAccount;

    @FindBy(css = "#id_state")
    public WebElement state;






    public void selectstate(String wstate){

        Select select=new Select(state);
        select.selectByVisibleText(wstate);
    }


}
