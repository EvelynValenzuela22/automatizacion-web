package com.semilleroias.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddEmployee extends PageObject {

    public AddEmployee() {
    }
    public static final Target TXT_FIRST_NAME = Target.the("first Name").located(By.id("firstName"));
    public static final Target TXT_MIDDLE_NAME = Target.the("middle Name").located(By.id("middleName"));
    public static final Target TXT_LAST_NAME = Target.the("last Name").located(By.id("lastName"));
    public static final Target BTN_PHOTO = Target.the("add photograph").located(By.id("photofile"));
    public static final Target CHK_LOGIN_DETAILS = Target.the("chk login details").located(By.id("chkLogin"));
    public static final Target TXT_USERNAME = Target.the("username login").located(By.id("user_name"));
    public static final Target TXT_PASSWORD = Target.the("password login").located(By.id("user_password"));
    public static final Target TXT_RE_PASSWORD = Target.the("re password login").located(By.id("re_password"));
    public static final Target BTN_SAVE = Target.the("btn save").located(By.id("btnSave"));







}
