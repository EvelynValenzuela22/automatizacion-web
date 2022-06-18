package com.semilleroias.steps;

import com.semilleroias.page.AddEmployeePage;
import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.Step;

public class CrearUsuarioSteps {
    AddEmployeePage addEmployeePage;

    @Step("Ingresar datos del empleado")
    public void ingresarEmployee(DataTable dataTable) {
        addEmployeePage.ingresarDatosEmpleado(dataTable);
    }
}
