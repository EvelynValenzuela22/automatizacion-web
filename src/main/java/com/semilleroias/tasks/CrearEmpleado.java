package com.semilleroias.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import static com.semilleroias.iu.AddEmployee.*;
import static com.semilleroias.iu.ViewEmployeeList.LINK_ADD_EMPLOYEE;
import static com.semilleroias.iu.ViewEmployeeList.LINK_MENU_PIM;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class CrearEmpleado implements Task {
    private String firstName;
    private String lastName;
    private String middleName;
    private String photo;
    private String userLogin;
    private String passLogin;

    public CrearEmpleado(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        firstName = data.get(0).get("firstName");
        lastName = data.get(0).get("lastName");
        middleName = data.get(0).get("middleName");
        photo = data.get(0).get("photograph");
        userLogin = data.get(0).get("nameLogin");
        passLogin = data.get(0).get("passLogin");
    }

    public static CrearEmpleado datosEmpleado(DataTable dataTable) {
        return Tasks.instrumented(CrearEmpleado.class, dataTable);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        File localProject;
        localProject = new File(".");
        Path image = Paths.get(localProject + "\\src\\test\\resources\\testImages\\"+photo);
        actor.attemptsTo(WaitUntil.the(LINK_MENU_PIM,isCurrentlyEnabled()).forNoMoreThan(15).seconds());
        actor.attemptsTo(Click.on(LINK_MENU_PIM));
        actor.attemptsTo(WaitUntil.the(LINK_ADD_EMPLOYEE,isCurrentlyEnabled()).forNoMoreThan(15).seconds());
        actor.attemptsTo(Click.on(LINK_ADD_EMPLOYEE));
        actor.attemptsTo(Enter.theValue(firstName).into(TXT_FIRST_NAME));
        actor.attemptsTo(Enter.theValue(middleName).into(TXT_MIDDLE_NAME));
        actor.attemptsTo(Enter.theValue(lastName).into(TXT_LAST_NAME));
        actor.attemptsTo(Upload.theFile(image).to(BTN_PHOTO));
        actor.attemptsTo(Click.on(CHK_LOGIN_DETAILS));
        actor.attemptsTo(Enter.theValue(userLogin).into(TXT_USERNAME));
        actor.attemptsTo(Enter.theValue(passLogin).into(TXT_PASSWORD));
        actor.attemptsTo(Enter.theValue(passLogin).into(TXT_RE_PASSWORD));
        actor.attemptsTo(Click.on(BTN_SAVE));
        actor.attemptsTo(Click.on(BTN_SAVE));
    }
}
