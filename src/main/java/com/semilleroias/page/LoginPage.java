package com.semilleroias.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.time.Duration;

public class LoginPage extends PageObject {

    @FindBy(name = "txtUsername")
    WebElementFacade txtUsername;
    @FindBy(name = "txtPassword")
    WebElementFacade txtPassword;
    @FindBy(id = "btnLogin")
    WebElementFacade btnSubmit;

    public void ingresarUsuario(String usuario) {
        withTimeoutOf(Duration.ofSeconds(20)).waitFor(txtUsername).click(); //Espera si se le puede hacer click
        txtUsername.typeAndTab(usuario);
    }

    public void ingresarClave(String clave) {
        txtPassword.typeAndTab(clave);
    }

    public void accederBotonLogin() {
        btnSubmit.click();
    }
}
