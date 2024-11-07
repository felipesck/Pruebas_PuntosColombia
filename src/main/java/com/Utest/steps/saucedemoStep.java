package com.Utest.steps;


import com.Utest.pageObject.saucedemoObject;
import com.Utest.utils.Utilidades;
import com.Utest.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class saucedemoStep {
    saucedemoObject saucedemoObject;


    @Step
    public void abrirWeb() {
        saucedemoObject.open();
    }

    @Step
    public void escribirUser(String user) {
        Utilidades.esperarExplicito30(saucedemoObject.getDriver(), saucedemoObject.getTxtUserName());
        saucedemoObject.getDriver().findElement(saucedemoObject.getTxtUserName()).sendKeys(user);
    }

    @Step
    public void escribirPassword(String password) {
        Utilidades.esperarExplicito30(saucedemoObject.getDriver(), saucedemoObject.getTxtPassword());
        saucedemoObject.getDriver().findElement(saucedemoObject.getTxtPassword()).sendKeys(password);
        Utilidades.esperar(2000);
    }
    @Step
    public void seleccionarLogin() {
        Utilidades.esperarExplicito30(saucedemoObject.getDriver(), saucedemoObject.getBtnLogin());
        saucedemoObject.getDriver().findElement(saucedemoObject.getBtnLogin()).click();
        Utilidades.esperar(1000);
    }

    @Step
    public void seleccionarArticulo(String articulo) {
        Utilidades.esperarExplicito30(saucedemoObject.getDriver(), saucedemoObject.getBtnProductos());
        saucedemoObject.getDriver().findElement(By.xpath("//*[contains(text(),'"+articulo+"')]")).click();
        Utilidades.esperar(1000);
    }

    @Step
    public void seleccionarAddCart() {
        Utilidades.esperarExplicito30(saucedemoObject.getDriver(), saucedemoObject.getBtnAddCart());
        saucedemoObject.getDriver().findElement(saucedemoObject.getBtnAddCart()).click();
        Utilidades.esperar(1000);
    }

    @Step
    public void seleccionarCarritoDeCompras() {
        Utilidades.esperarExplicito30(saucedemoObject.getDriver(), saucedemoObject.getBtnCarritoDeCompras());
        saucedemoObject.getDriver().findElement(saucedemoObject.getBtnCarritoDeCompras()).click();
        Utilidades.esperar(2000);
    }

    @Step
    public void seleccionarCheckout() {
        Utilidades.esperarExplicito30(saucedemoObject.getDriver(), saucedemoObject.getBtnCheckout());
        saucedemoObject.getDriver().findElement(saucedemoObject.getBtnCheckout()).click();
        Utilidades.esperar(1000);
    }

    @Step
    public void escribirFisrtName(String fisrtName) {
        Utilidades.esperarExplicito30(saucedemoObject.getDriver(), saucedemoObject.getTxtFirstName());
        saucedemoObject.getDriver().findElement(saucedemoObject.getTxtFirstName()).sendKeys(fisrtName);
        Utilidades.esperar(1000);
    }

    @Step
    public void escribirLastName(String lastName) {
        Utilidades.esperarExplicito30(saucedemoObject.getDriver(), saucedemoObject.getTxtLastName());
        saucedemoObject.getDriver().findElement(saucedemoObject.getTxtLastName()).sendKeys(lastName);
        Utilidades.esperar(1000);
    }

    @Step
    public void escribirZip(String zip) {
        Utilidades.esperarExplicito30(saucedemoObject.getDriver(), saucedemoObject.getTxtZip());
        saucedemoObject.getDriver().findElement(saucedemoObject.getTxtZip()).sendKeys(zip);
        Utilidades.esperar(1000);
    }

    @Step
    public void seleccionarContinue() {
        Utilidades.esperarExplicito30(saucedemoObject.getDriver(), saucedemoObject.getBtnContinue());
        saucedemoObject.getDriver().findElement(saucedemoObject.getBtnContinue()).click();
        Utilidades.esperar(1000);
    }

    @Step
    public void seleecionarFinish() {
        Utilidades.esperarExplicito30(saucedemoObject.getDriver(), saucedemoObject.getBtnFinish());
        saucedemoObject.getDriver().findElement(saucedemoObject.getBtnFinish()).click();
        Utilidades.esperar(1000);
    }

    @Step
    public void validoCompraExitosa() {
        Utilidades.esperarExplicito30(saucedemoObject.getDriver(), saucedemoObject.getLblCompraExitosa());
        Assert.assertTrue(saucedemoObject.getDriver().findElement(saucedemoObject.getLblCompraExitosa()).getText(), true);
        Utilidades.esperar(1000);
    }

    @Step
    public void validolblUserLocked(){
        Utilidades.esperarExplicito30(saucedemoObject.getDriver(), saucedemoObject.getLblUserLocked());
        Assert.assertTrue(saucedemoObject.getDriver().findElement(saucedemoObject.getLblUserLocked()).getText(), true);
        Utilidades.esperar(1000);
    }
}
