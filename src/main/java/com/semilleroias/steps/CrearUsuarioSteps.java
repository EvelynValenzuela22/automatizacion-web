package com.semilleroias.steps;

import com.semilleroias.page.AddEmployeePage;
import com.semilleroias.page.HomeOrangeHrmPage;
import com.semilleroias.ui.AddEmployee;
import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.Step;

public class CrearUsuarioSteps {
    AddEmployeePage addEmployeePage;

    @Step("Ingresar datos del empleado")
    public void ingresoAddEmployee(DataTable dataTable) {
        addEmployeePage.ingresarDatosEmpleado(dataTable);
    }
}
