package com.semilleroias.steps;

import com.semilleroias.page.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {

    LoginPage loginPage;
    @Step("Ingresar al login de la aplicacion OrangeHRM")
    public void queMeEncuentroEnOrangeHRM() {
        loginPage.open();
    }
    @Step("Ingresar las credenciales validas de acceso")
    public void credencialesLogin(String usuario, String clave) {
        loginPage.ingresarUsuario(usuario);
        loginPage.ingresarClave(clave);
    }

    @Step("Validar el acceso correcto al sistema")

    public void accederBotonLogin() {
        loginPage.accederBotonLogin();
    }
}
