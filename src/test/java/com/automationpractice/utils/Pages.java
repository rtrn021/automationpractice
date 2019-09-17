package com.automationpractice.utils;

import com.automationpractice.pages.*;

public class Pages {
    private CreateAccountPage createaccountpage;
    private HomePage homepage;
    private LoginPage loginpage;
    private MyAccount myaccount;
    private ProductPage productpage;


    public CreateAccountPage createaccountpage() {
        if (createaccountpage == null) {
            createaccountpage = new CreateAccountPage();
        }
        return createaccountpage;
    }

    public LoginPage loginpage() {
        if (loginpage == null) {
            loginpage = new LoginPage();
        }
        return loginpage;
    }

    public HomePage homepage() {
        if (homepage == null) {
            homepage = new HomePage();
        }
        return homepage;
    }

    public MyAccount myaccount() {
        if (myaccount == null) {
            myaccount = new MyAccount();
        }
        return myaccount;
    }

    public ProductPage productpage() {
        if (productpage == null) {
            productpage = new ProductPage();
        }
        return productpage;
    }

}
