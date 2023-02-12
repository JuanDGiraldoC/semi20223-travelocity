package com.travelocity.tasks;

import com.travelocity.userinterfaces.DetalleHospedaje;
import com.travelocity.userinterfaces.DetalleVuelos;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarFecha {

    public static Performable hospedajePor(Integer cantidadDias) {
        return Task.where("Selecciona los {0} dias de hospedaje",
                Click.on(DetalleHospedaje.SELECT_FECHA_CHECK_OUT),
                Click.on(DetalleHospedaje.FECHA_CHECK_OUT),
                Click.on(DetalleHospedaje.BUT_LISTO),
                Click.on(DetalleHospedaje.BUT_BUSCAR)
                );
    }

    public static Performable vueloRedondoPor(Integer cantidadDias) {
        return Task.where("Selecciona los {0} dias de hospedaje",
                Click.on(DetalleVuelos.SELECT_FECHA_REGRESO),
                Click.on(DetalleVuelos.FECHA_REGRESO),
                Click.on(DetalleVuelos.BUT_LISTO),
                Click.on(DetalleVuelos.BUT_BUSCAR)
                );
    }
}