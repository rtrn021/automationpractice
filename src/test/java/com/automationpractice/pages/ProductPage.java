package com.automationpractice.pages;

import com.automationpractice.Product.Dress;
import com.automationpractice.utils.BrowserUtils;
import com.automationpractice.utils.Driver;
import com.automationpractice.utils.Pages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    Pages pages=new Pages();

    public ProductPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='exclusive']")
    public WebElement addtocart;

    @FindBy(css = "[title='Proceed to checkout']")
    public WebElement proceedtocheckout;

    @FindBy(xpath = "//div//h1[@itemprop='name']")
    public WebElement displayedproductname;

    @FindBy(css = ".cart_description>.product-name")
    public WebElement productname;

    @FindBy(css = "#color_to_pick_list>.selected>a")
    public WebElement productcolor;

    @FindBy(css = "#group_1>[selected='selected']")
    public WebElement productsize;

    @FindBy(xpath = "//td[@class='cart_description']//small/a")
    public WebElement product_color_and_size;


    public Dress getdetailsbeforecheckout(){
        Dress dress=new Dress();
        dress.name= BrowserUtils.waitForVisibility(pages.productpage().displayedproductname).getText();
        dress.color=pages.productpage().productcolor.getAttribute("title");
        dress.size=pages.productpage().productsize.getAttribute("title");

        return dress;
    }


    public Dress getdetailsaftercheckout(){
        Dress dress=new Dress();
        dress.name=BrowserUtils.waitForClickability(pages.productpage().productname).getText();
        String product_color_size=pages.productpage().product_color_and_size.getText();
        dress.size=product_color_size.substring( product_color_size.length()-1,product_color_size.length() );
        dress.color=product_color_size.substring( product_color_size.indexOf(" ")+3,product_color_size.indexOf(","));
        return dress;
    }


}
