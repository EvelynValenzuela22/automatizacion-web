package com.semilleroias.stepsdefinition;

import com.semilleroias.steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepsDefinition {

    @Steps
    LoginSteps loginSteps;
    @Given("que me encuentro en OrangeHRM")
    public void queMeEncuentroEnOrangeHRM() {
        loginSteps.queMeEncuentroEnOrangeHRM();
    }
    @When("ingreso credenciales usuario {string} con clave {string}")
    public void ingresoCredencialesUsuarioUsuarioConClaveClave(String usuario, String clave) {
        loginSteps.credencialesLogin(usuario, clave);
        loginSteps.accederBotonLogin();

    }

}
