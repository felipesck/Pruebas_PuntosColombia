package com.Utest.stepDefinitions;

import com.Utest.steps.saucedemoStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;


public class SaucedemoStepDefinition {
    @Steps
    saucedemoStep saucedemoStep;


    @Given("^Ingresar al portal$")
    public void ingresarAlPortal() {
            saucedemoStep.abrirWeb();
    }

    @When("^Realizar login \"([^\"]*)\" \"([^\"]*)\"$")
    public void realizarLogin(String user, String password) {
        saucedemoStep.escribirUser(user);
        saucedemoStep.escribirPassword(password);
        saucedemoStep.seleccionarLogin();
    }

    @When("^Comprar articulo \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void comprarArticulo(String articulo, String fisrtName, String lastName,  String zip) {

        saucedemoStep.seleccionarArticulo(articulo);
        saucedemoStep.seleccionarAddCart();
        saucedemoStep.seleccionarCarritoDeCompras();
        saucedemoStep.seleccionarCheckout();
        saucedemoStep.escribirFisrtName(fisrtName);
        saucedemoStep.escribirLastName(lastName);
        saucedemoStep.escribirZip(zip);
        saucedemoStep.seleccionarContinue();
        saucedemoStep.seleecionarFinish();
    }


    @Then("^Valido user locked$")
    public void validoUserLocked() {
        saucedemoStep.validolblUserLocked();
    }

    @Then("^Valido compra de articulo$")
    public void validoCompraDeArticulo() {
        saucedemoStep.validoCompraExitosa();
    }




}
