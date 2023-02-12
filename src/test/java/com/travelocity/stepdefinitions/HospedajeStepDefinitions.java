package com.travelocity.stepdefinitions;

import com.travelocity.tasks.AgregarHospedaje;
import com.travelocity.tasks.SeleccionarDestinoHospedaje;
import com.travelocity.tasks.SeleccionarFecha;
import com.travelocity.userinterfaces.VuelosEncontrados;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class HospedajeStepDefinitions {

    @Dado("{actor} se encuentra en {string}")
    public void hospedajeDestino(Actor actor, String destino) {
        actor.attemptsTo(
                SeleccionarDestinoHospedaje.paraEstarEn(destino)
        );
    }
    @Cuando("quiere hospedarse por {int} dias agregando un auto")
    public void hospedarsePorDiasAgregarAuto(Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarHospedaje.unAuto(),
                SeleccionarFecha.hospedajePor(cantidadDias)
        );
    }
    @Entonces("debe obtener alguna opcion de hospedaje")
    public void viajeObtenerAlgunaOpcion() {
        Ensure.that(VuelosEncontrados.LIST_VUELOS_ENCONTRADOS).value().hasSizeGreaterThan(0);
    }
}
