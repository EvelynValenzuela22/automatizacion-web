package com.semilleroias.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.time.Duration;

public class HomeOrangeHrmPage extends PageObject {

    @FindBy(xpath="//*[@id='welcome' and contains(text(), 'Welcome')]")
    WebElementFacade lblWebcomeHome;

    @FindBy(id = "menu_pim_viewPimModule")
    WebElementFacade btnPIM;

    @FindBy(id = "menu_pim_addEmployee")
    WebElementFacade btnAddEmployee;

    public boolean validarWelcomeHome() {
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(lblWebcomeHome);
        return lblWebcomeHome.isVisible();
    }

    public void accederBotonPIM() {
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(btnPIM);
        btnPIM.click();

    }
    public void accederBotonAddEmployee() {
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(btnAddEmployee);
        btnAddEmployee.click();

    }


}
