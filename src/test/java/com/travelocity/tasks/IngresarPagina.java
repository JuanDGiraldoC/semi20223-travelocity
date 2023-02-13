package com.travelocity.tasks;

import com.travelocity.pageobject.TravelocityHomePage;
import com.travelocity.pageobject.TravelocitySignUpPage;
import com.travelocity.userinterfaces.DetalleIniciarSesion;
import com.travelocity.userinterfaces.MenuTravelocity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class IngresarPagina {

    public  static Performable crearCuenta(){
        return Task.where("{0} ingresa al Sign Up travelocity para crear una cuenta",
                Open.browserOn().the(TravelocityHomePage.class),
                Click.on(MenuTravelocity.BUT_INICIAR_SESION),
                Click.on(DetalleIniciarSesion.BUT_CREAR_CUENTA_GRATIS)
        );
    }

    public  static Performable crearCuenta2(){
        return Task.where("{0} ingresa a travelocity para crear una cuenta",
                Open.browserOn().the(TravelocitySignUpPage.class)
        );
    }

}
