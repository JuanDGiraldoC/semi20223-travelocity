package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleVuelos {

    public static final Target BUT_ORIGEN = Target.the("boton de origen").locatedBy("//button[@data-stid='location-field-leg1-origin-menu-trigger']");
    public static final Target IN_ORIGEN = Target.the("input de origen").locatedBy("//input[@id='location-field-leg1-origin']");
    public static final Target BUT_DESTINO = Target.the("boton de destino").locatedBy("//button[@data-stid='location-field-leg1-destination-menu-trigger']");
    public static final Target IN_DESTINO = Target.the("input de destino").locatedBy("//input[@id='location-field-leg1-destination']");
    public static final Target BUT_TIPO_CLASE = Target.the("boton tipos de clases de asientos").locatedBy("//button[@data-testid='preferred-class-input-trigger']");
    public static final Target SPAN_CLASE_ECON_PREMIUM = Target.the("Selector clase economica premium").locatedBy("//span[text()='Clase económica Premium']");
    public static final Target SELECT_FECHA_REGRESO = Target.the("selector calendario de regreso").locatedBy("//button[@id='d2-btn']");
    public static final Target FECHA_REGRESO = Target.the("calendar fecha de regreso").locatedByFirstMatching("//button[@data-day='27']");
    public static final Target BUT_LISTO = Target.the("boton listo calendar").locatedBy("//button[@data-stid='apply-date-picker']");
    public static final Target BUT_BUSCAR = Target.the("boton buscar vuelos").locatedBy("//button[@data-testid='submit-button']");

}
