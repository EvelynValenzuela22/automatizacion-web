package com.semilleroias.iu;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ViewEmployeeList {
    public ViewEmployeeList() {
    }
    public static final Target LINK_MENU_PIM = Target.the("menu PIM").located(By.id("menu_pim_viewPimModule"));
    public static final Target LINK_ADD_EMPLOYEE = Target.the("first Name").located(By.id("menu_pim_addEmployee"));
}
