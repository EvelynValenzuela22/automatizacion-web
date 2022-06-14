package com.semilleroias.steps;

import com.semilleroias.page.HomeOrangeHrmPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static  org.hamcrest.Matchers.*;


public class HomeOrangeHrmSteps {

    HomeOrangeHrmPage homeOrangeHrmPage;

    public void validoElIngresoExitosoAlSistema(){
        assertThat(true, is(homeOrangeHrmPage.validarWelcomeHome()));

    }

    @Step("Ingresar a AddEmployee de la aplicacion")
    public void ingresoAddEmployee() {
        homeOrangeHrmPage.accederBotonPIM();
        homeOrangeHrmPage.accederBotonAddEmployee();
    }
}

