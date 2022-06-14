package com.semilleroias.steps;

import com.semilleroias.page.ViewEmployeeAddedPage;
import net.thucydides.core.annotations.Step;

public class ViewEmployeeAddedSteps {

    ViewEmployeeAddedPage viewEmployeeAddedPage;

    @Step("Validar creación del empleado")
    public void validarCreacionEmpleado() {
        viewEmployeeAddedPage.validarIngresoEmpleado();
    }

}
