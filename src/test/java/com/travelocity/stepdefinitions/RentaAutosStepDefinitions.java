package com.travelocity.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

public class RentaAutosStepDefinitions {
    @Dado("{actor} llega al aeropuerto de {string}")
    public void llegadaAeropuertoDe(Actor actor, String ciudadEntrega) {
        throw new io.cucumber.java.PendingException();
    }
    @Cuando("necesita rentar un auto por {int} días y devolverlo en el aeropuerto de {string}")
    public void rentarAutoPorDiasYDevolucion(Integer cantidadDias, String ciudadDevolucion) {
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("debe obtener alguna opcion de auto")
    public void autoObtenerAlgunaOpcion() {
        throw new io.cucumber.java.PendingException();
    }
}
