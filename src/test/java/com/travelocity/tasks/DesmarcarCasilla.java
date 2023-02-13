package com.travelocity.tasks;

import com.travelocity.userinterfaces.FormularioSignUp;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class DesmarcarCasilla {

    public static Performable mantenerSesionAbierta(){
        return Task.where("Desmarcar casilla de mantener sesion abierta",
                Click.on(FormularioSignUp.IN_SESION_ABIERTA)
                );
    }

}
