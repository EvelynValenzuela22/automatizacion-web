package com.semilleroias.stepsdefinition;

import com.semilleroias.steps.HomeOrangeHrmSteps;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class HomeOrangeHrmStepsDefinition {
    @Steps
    HomeOrangeHrmSteps homeOrangeHrmSteps;

    @Then("valido el ingreso exitoso al sistema")
    public void validoElIngresoExitosoAlSistema() {
        homeOrangeHrmSteps.validoElIngresoExitosoAlSistema();

    }



}
