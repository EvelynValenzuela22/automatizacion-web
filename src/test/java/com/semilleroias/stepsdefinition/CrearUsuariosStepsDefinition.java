package com.semilleroias.stepsdefinition;

import com.semilleroias.questions.UsuarioCreado;
import com.semilleroias.tasks.CrearEmpleado;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class CrearUsuariosStepsDefinition {
    @When("agrega los datos de empleado")
    public void agregaLosDatosDeEmpleado(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(CrearEmpleado.datosEmpleado(dataTable));
    }
    @Then("valido que el empleado se ha creado de forma correcta")
    public void validoQueElEmpleadoSeHaCreadoDeFormaCorrecta() {
        OnStage.theActorInTheSpotlight().should(seeThat(UsuarioCreado.enPantalla(), equalTo(true)));
    }
}
