package com.semilleroias.tasks;

import com.semilleroias.iu.LoginOrangeHrmPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina  implements Task {

    private LoginOrangeHrmPage loginOrangeHrmPage;
    public static AbrirPagina orangeHrm() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(loginOrangeHrmPage));
    }
}
