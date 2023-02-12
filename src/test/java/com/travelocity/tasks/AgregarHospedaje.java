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

}
