package com.travelocity.tasks;

import com.travelocity.userinterfaces.DetalleVuelos;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarTipo {

    public static Performable ClaseEconomicaPremium(){
        return Task.where("en Clase economica Premium",
                Click.on(DetalleVuelos.BUT_TIPO_CLASE),
                Click.on(DetalleVuelos.SPAN_CLASE_ECON_PREMIUM)
                );
    }

}
