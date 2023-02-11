package com.travelocity.tasks;

import com.travelocity.userinterfaces.DetalleVuelos;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class SeleccionarDestinoVuelos {

    public static Performable ParaViajarHaciaYDias (String destino, Integer diasViaje){
        return Task.where("quiera viajar hacia {0} por {1} días",
                Click.on(DetalleVuelos.BUT_DESTINO),
                Enter.theValue(destino).into(DetalleVuelos.IN_DESTINO).thenHit(Keys.ENTER),
                Click.on(DetalleVuelos.SELECT_FECHA_REGRESO),
                Click.on(DetalleVuelos.FECHA_REGRESO),
                Click.on(DetalleVuelos.BUT_LISTO),
                Click.on(DetalleVuelos.BUT_BUSCAR)
        );
    }

}
