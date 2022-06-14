package com.semilleroias.stepsdefinition;

import com.semilleroias.steps.ViewEmployeeAddedSteps;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewEmployeeAddedStepsDefinition {
    @Steps

    ViewEmployeeAddedSteps viewEmployeeAddedSteps;
    @Then("valido que el empleado se ha creado de forma correcta")
    public void validoQueElEmpleadoSeHaCreadoDeFormaCorrecta() {
        viewEmployeeAddedSteps.validarCreacionEmpleado();
    }
}
