package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleHospedaje {

    public static final Target BUT_DESTINO = Target.the("boton de destino").locatedBy("//button[@data-stid='location-field-destination-menu-trigger']");
    public static final Target IN_DESTINO = Target.the("input de destino").locatedBy("//input[@id='location-field-destination']");
    public static final Target IN_AGREGAR_AUTO = Target.the("Check para agregar auto").locatedBy("//input[@id='add-car-switch']");
    public static final Target SELECT_FECHA_CHECK_OUT = Target.the("selector calendario de check out").locatedBy("//button[@id='d2-btn']");
    public static final Target FECHA_CHECK_OUT = Target.the("calendar fecha de check out").locatedByFirstMatching("//button[@data-day='28']");
    public static final Target BUT_LISTO_CALENDAR = Target.the("boton listo calendar").locatedBy("//button[@data-stid='apply-date-picker']");
    public static final Target BUT_BUSCAR = Target.the("boton buscar vuelos").locatedBy("//button[@data-testid='submit-button']");
    public static final Target BUT_PERSONAS = Target.the("boton añadir personas").locatedBy("//button[@data-testid='travelers-field-trigger']");
    public static final Target BUT_AGREGAR_HABITACION = Target.the("boton añadir personas").locatedBy("//button[@data-testid='add-room-button']");
    public static final Target BUT_LISTO_PERSONAS = Target.the("boton agregar una habitacion").locatedBy("//button[@data-testid='guests-done-button']");

}
