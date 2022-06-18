package com.semilleroias.iu;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class LoginOrangeHrmPage extends PageObject {
    public static final Target TXT_USUARIO = Target.the("txt usuario").located(By.name("txtUsername"));
    public static final Target TXT_CLAVE = Target.the("txt clave").located(By.name("txtPassword"));

    public static final Target BTN_LOGUEO = Target.the("btn logueo").located(By.id("btnLogin"));

    public LoginOrangeHrmPage() {
    }
}
