package com.semilleroias.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ViewPersonalDetails extends PageObject {
    public ViewPersonalDetails() {
    }
    public static final Target TXT_FIRST_NAME = Target.the("firstname in personal details").located(By.id("personal_txtEmpFirstName"));
}

