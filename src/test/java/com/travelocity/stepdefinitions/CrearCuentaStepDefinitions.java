package com.travelocity.stepdefinitions;

import com.travelocity.tasks.DesmarcarCasilla;
import com.travelocity.tasks.IngresarDatos;
import com.travelocity.tasks.IngresarPagina;
import com.travelocity.userinterfaces.FormularioSignUp;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.jetbrains.annotations.NotNull;

public class CrearCuentaStepDefinitions {

    @Dado("{actor} quiere guardar y gestionar sus viajes")
    public void ingresaPaginaCrearCuenta(@NotNull Actor actor) {
        actor.attemptsTo(
                IngresarPagina.crearCuenta()
                /*IngresarPagina.crearCuenta2()
                Usar el método anterior para acceder directamente a la pestaña LogIn
                e intentar simular que la prueba sigue (Igual ocurre un error)*/
        );
    }

    @Cuando("quiere crear una cuenta nueva con nombre {string}, apellido {string}, e-mail {string}, password {string}")
    public void crearCuentaNueva(String nombre, String apellido, String correo, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarDatos.enPaginaSignUp(nombre, apellido, correo, password),
                DesmarcarCasilla.mantenerSesionAbierta()
        );
    }

    @Entonces("debe obtener un resultado fallido")
    public void cuentaCreadaCorrectamente() {
        Ensure.that(FormularioSignUp.DIV_MENSAJE_ERROR).isDisplayed();
    }
}
