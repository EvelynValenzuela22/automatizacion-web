package com.semilleroias.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.time.Duration;

public class ViewEmployeeAddedPage extends PageObject {

    @FindBy(id ="frmEmpPersonalDetails")
    WebElementFacade frmEmployee;

    public boolean validarIngresoEmpleado() {
        withTimeoutOf(Duration.ofSeconds(20)).waitFor(frmEmployee);
        return frmEmployee.isVisible();
    }
}
