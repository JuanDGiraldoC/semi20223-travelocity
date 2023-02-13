package com.travelocity.tasks;

import com.travelocity.userinterfaces.FormularioSignUp;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class IngresarDatos {

    public static Performable enPaginaSignUp(String nombre, String apellido, String correo, String password){
        return Task.where("Adicionar datos en el formulario de la pagina SignUp",
                Enter.theValue(correo).into(FormularioSignUp.IN_CORREO_ELECTRONICO),
                Enter.theValue(nombre).into(FormularioSignUp.IN_NOMBRE),
                Enter.theValue(apellido).into(FormularioSignUp.IN_APELLIDO),
                Enter.theValue(password).into(FormularioSignUp.IN_PASSWORD),
                WaitUntil.the(FormularioSignUp.BUT_CONTINUAR, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                Click.on(FormularioSignUp.BUT_CONTINUAR)
        );
        //Al momento de ingresar el password se crashea la prueba
    }

}
