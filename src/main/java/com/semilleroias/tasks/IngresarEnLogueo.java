package com.semilleroias.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.semilleroias.iu.LoginOrangeHrmPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class IngresarEnLogueo implements Task {

    private String usuario;
    private String clave;

    public IngresarEnLogueo(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public static IngresarEnLogueo lasCredencialesDeUsuario(String usuario, String clave) {
        return Tasks.instrumented(IngresarEnLogueo.class, usuario, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo (WaitUntil.the (TXT_USUARIO, isCurrentlyEnabled()).forNoMoreThan(20). seconds());
        actor.attemptsTo(Enter.theValue(usuario).into(TXT_USUARIO));
        actor.attemptsTo (Enter.keyValues (clave).into (TXT_CLAVE));
        actor.attemptsTo (Click.on (BTN_LOGUEO));

    }
}
