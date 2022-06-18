package com.semilleroias.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.semilleroias.iu.HomeOrangeHrmPage.LBL_USUARIO_LOGUEADO;
import static com.semilleroias.iu.ViewPersonalDetails.TXT_FIRST_NAME;

public class UsuarioCreado implements Question<Boolean> {
    public static UsuarioCreado enPantalla() { return new UsuarioCreado();
    }

    public Boolean answeredBy(Actor actor) {
        return TXT_FIRST_NAME.resolveFor(actor).isVisible();
    }
}
