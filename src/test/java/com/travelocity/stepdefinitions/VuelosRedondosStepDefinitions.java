package com.travelocity.stepdefinitions;

import com.travelocity.tasks.SeleccionarDestinoVuelos;
import com.travelocity.tasks.SeleccionarOrigenVuelos;
import com.travelocity.tasks.SeleccionarTipo;
import com.travelocity.userinterfaces.VuelosEncontrados;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class VuelosRedondosStepDefinitions {

    @Dado("{actor} esta en {string}")
    public void viajeOrigen(Actor actor, String origen) {
        actor.attemptsTo(
                SeleccionarOrigenVuelos.ParaViajarDesde(origen)
        );
    }
    @Cuando("quiera viajar a {string} por {int} dias")
    public void viajeDestinoConDias(String destino, Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoVuelos.ParaViajarHaciaYDias(destino, cantidadDias)
        );
    }
    @Cuando("quiera viajar a {string} en clase economica premium por {int} dias")
    public void viajeDestinoConDiasEnClaseEconomicaPremium(String destino, Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarTipo.ClaseEconomicaPremium(),
                SeleccionarDestinoVuelos.ParaViajarHaciaYDias(destino, cantidadDias)
        );
    }
    @Entonces("debe obtener alguna opcion de vuelo")
    public void viajeObtenerAlgunaOpcion() {
        Ensure.that(VuelosEncontrados.LIST_VUELOS_ENCONTRADOS).value().hasSizeGreaterThan(0);
    }

}
