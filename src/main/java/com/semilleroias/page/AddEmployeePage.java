package com.semilleroias.page;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class AddEmployeePage extends PageObject {

    @FindBy(id = "firstName")
    WebElementFacade txtFirstName;

    @FindBy(id = "middleName")
    WebElementFacade txtMiddleName;

    @FindBy(id = "lastName")
    WebElementFacade txtLastName;

    @FindBy(id = "photofile")
    WebElementFacade btnPhotofile;

    @FindBy(id = "chkLogin")
    WebElementFacade chkLogin;

    @FindBy(id = "user_name")
    WebElementFacade txtUsername;

    @FindBy(id = "user_password")
    WebElementFacade txtUserPassword;

    @FindBy(id = "re_password")
    WebElementFacade txtRePassword;

    @FindBy(id = "btnSave")
    WebElementFacade btnSave;

    public void ingresarDatosEmpleado(DataTable dataTable) {


        List<Map<String, String>> data = dataTable.asMaps();
        withTimeoutOf(Duration.ofSeconds(20)).waitFor(txtFirstName).click();
        txtFirstName.typeAndTab(data.get(0).get("firstName"));
        txtMiddleName.typeAndTab(data.get(0).get("middleName") != null ? data.get(0).get("middleName") :"" );
        txtLastName.type(data.get(0).get("lastName"));

        upload("C:\\Users\\Admin\\Documents\\Semillero automatizacion\\semilleroias\\src\\test\\resources\\testImages\\" + data.get(0).get("photograph")).to(btnPhotofile);
        chkLogin.click();
        withTimeoutOf(Duration.ofSeconds(15)).waitFor(txtUsername).click();
        txtUsername.typeAndTab(data.get(0).get("nameLogin"));
        txtUserPassword.typeAndTab(data.get(0).get("passLogin"));
        txtRePassword.typeAndTab(data.get(0).get("passLogin"));
        btnSave.click();

    }

}
