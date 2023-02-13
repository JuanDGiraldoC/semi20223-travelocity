package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuTravelocity {

    public static final Target A_VUELOS = Target.the("menu de vuelos").locatedBy("//span[text()='Vuelos']/..");
    public static final Target A_HOSPEDAJE = Target.the("menu de hospedajes").locatedBy("//span[text()='Hospedaje']/..");
    public static final Target A_AUTOS = Target.the("menu de autos").locatedBy("//span[text()='Autos']/..");
    public static final Target BUT_INICIAR_SESION = Target.the("boton para iniciar sesion").locatedBy("//div[@id='gc-custom-header-nav-bar-acct-menu']/button");

}
