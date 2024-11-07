package com.Utest.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class saucedemoObject extends PageObject {

    By txtUserName = By.id("user-name");
    By txtPassword = By.id("password");
    By btnLogin = By.id("login-button");
    By btnCarritoDeCompras = By.xpath("//span[contains(text(),'1')]");
    By btnProductos = By.xpath("//span[contains(text(),'Products')]");
    By btnAddCart = By.id("add-to-cart");
    By btnCheckout = By.id("checkout");
    By txtFirstName = By.id("first-name");
    By txtLastName = By.id("last-name");
    By txtZip = By.id("postal-code");
    By btnContinue = By.id("continue");
    By btnFinish = By.id("finish");
    By lblCompraExitosa = By.xpath("//h2[contains(text(),'Thank you for your order!')]");
    By lblUserLocked = By.xpath("//*[contains(text(),'Epic')]");


    public By getTxtFirstName() {return txtFirstName;}

    public By getTxtUserName() {
        return txtUserName;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnCheckout() {return btnCheckout;}

    public By getBtnLogin() {return btnLogin;}

    public By getBtnCarritoDeCompras() {return btnCarritoDeCompras;}

    public By getBtnProductos() {return btnProductos;}

    public By getBtnAddCart() {return btnAddCart;}

    public By getTxtZip() {return txtZip;}

    public By getTxtLastName() {return txtLastName;}

    public By getBtnContinue() {return btnContinue;}

    public By getBtnFinish() {return btnFinish;}

    public By getLblCompraExitosa() {return lblCompraExitosa;}

    public By getLblUserLocked() {return lblUserLocked;}
}
