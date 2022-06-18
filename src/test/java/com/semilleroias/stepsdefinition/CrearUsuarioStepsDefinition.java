package com.semilleroias.stepsdefinition;

import com.semilleroias.steps.CrearUsuarioSteps;
import com.semilleroias.steps.HomeOrangeHrmSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CrearUsuarioStepsDefinition {

    @Steps
    HomeOrangeHrmSteps homeOrangeHrmSteps;
    @Steps
    CrearUsuarioSteps crearUsuarioSteps;

    @When("agrega los datos de empleado")

    public void agregaLosDatosDeEmpleado(DataTable dataTable) {
        homeOrangeHrmSteps.ingresoAddEmployee();
        crearUsuarioSteps.ingresarEmployee(dataTable);
    }


}
