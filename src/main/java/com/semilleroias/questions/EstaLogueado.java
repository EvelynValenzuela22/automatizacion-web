package com.semilleroias.questions;

import io.cucumber.java.an.E;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.semilleroias.iu.HomeOrangeHrmPage.LBL_USUARIO_LOGUEADO;

public class EstaLogueado implements Question<Boolean> {

    public static EstaLogueado enLaPagina() {
        return new EstaLogueado();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_USUARIO_LOGUEADO.resolveFor(actor).isVisible();
    }
}
