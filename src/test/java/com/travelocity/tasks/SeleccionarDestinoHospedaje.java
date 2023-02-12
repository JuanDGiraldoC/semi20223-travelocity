package com.travelocity.tasks;

import com.travelocity.pageobject.TravelocityHomePage;
import com.travelocity.userinterfaces.DetalleHospedaje;
import com.travelocity.userinterfaces.MenuTravelocity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

public class SeleccionarDestinoHospedaje {

    public static Performable paraEstarEn(String destino){
        return Task.where("{0} abre travelocity en hospedaje y selecciona destino {1}",
                Open.browserOn().the(TravelocityHomePage.class),
                Click.on(MenuTravelocity.A_HOSPEDAJE),
                Click.on(DetalleHospedaje.BUT_DESTINO),
                Enter.theValue(destino).into(DetalleHospedaje.IN_DESTINO).thenHit(Keys.ENTER)
        );
    }

}
