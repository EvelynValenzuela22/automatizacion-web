package com.semilleroias.iu;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class HomeOrangeHrmPage extends PageObject {

    public HomeOrangeHrmPage() {
    }

    public static final Target LBL_USUARIO_LOGUEADO = Target.the("Lbl usuario logueado").located(By.xpath("//*[@id='welcome' and contains(text(), 'Welcome')]"));

}
