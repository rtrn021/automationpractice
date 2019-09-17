package com.automationpractice.pages;

import com.automationpractice.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {

    public MyAccount(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".logout")
    public WebElement signout;

    @FindBy(css = "#search_query_top")
    public WebElement search;

    @FindBy(name = "submit_search")
    public WebElement searchbutton;

    public void clicktoproduct(String productname){
        Driver.getDriver().findElement(By.xpath("(//img[contains(@title,'"+productname+"')])[1]")).click();
    }





}
