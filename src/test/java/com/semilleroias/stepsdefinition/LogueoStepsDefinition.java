package com.semilleroias.stepsdefinition;

import com.semilleroias.questions.EstaLogueado;
import com.semilleroias.tasks.AbrirPagina;
import com.semilleroias.tasks.IngresarEnLogueo;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static org.hamcrest.Matchers.equalTo;

public class LogueoStepsDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("que {string} se encuentra en OrangeHRM")
    public void queAnaSeEncuentraEnOrangeHRM(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(AbrirPagina.orangeHrm());
    }
    @When("agrega las credenciales usuario {string} con clave {string}")
    public void agregaLasCredencialesUsuarioConClave(String usuario, String clave) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarEnLogueo.lasCredencialesDeUsuario(usuario, clave));
    }
    @Then("valido el ingreso exitoso al sistema")
    public void validoElIngresoExitosoAlSistema() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(EstaLogueado.enLaPagina(), equalTo(true)
        ));
    }
}
