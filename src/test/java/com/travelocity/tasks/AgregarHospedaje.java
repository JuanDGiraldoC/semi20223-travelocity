package com.travelocity.tasks;

import com.travelocity.userinterfaces.DetalleHospedaje;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarHospedaje {

    public static Performable unAuto(){
        return Task.where("Agrega un auto a su hospedaje",
                Click.on(DetalleHospedaje.IN_AGREGAR_AUTO)
                );
    }
    public static Performable unaHabitacion(){
        return Task.where("Agrega una habitación más a su hospedaje",
                Click.on(DetalleHospedaje.BUT_PERSONAS),
                Click.on(DetalleHospedaje.BUT_AGREGAR_HABITACION),
                Click.on(DetalleHospedaje.BUT_LISTO_PERSONAS)
        );
    }

}
