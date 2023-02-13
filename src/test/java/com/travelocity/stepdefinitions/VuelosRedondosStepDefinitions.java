package com.travelocity.stepdefinitions;

import com.travelocity.tasks.SeleccionarDestinoVuelos;
import com.travelocity.tasks.SeleccionarFecha;
import com.travelocity.tasks.SeleccionarOrigenVuelos;
import com.travelocity.tasks.SeleccionarTipo;
import com.travelocity.userinterfaces.HotelesEncontrados;
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
                SeleccionarOrigenVuelos.paraViajarDesde(origen)
        );
    }
    @Cuando("quiera viajar a {string} por {int} dias")
    public void viajeDestinoConDias(String destino, Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoVuelos.paraViajarHacia(destino),
                SeleccionarFecha.vueloRedondoPor(cantidadDias)
        );
    }
    @Cuando("quiera viajar a {string} en clase economica premium por {int} dias")
    public void viajeDestinoConDiasEnClaseEconomicaPremium(String destino, Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoVuelos.paraViajarHacia(destino),
                SeleccionarTipo.claseEconomicaPremium(),
                SeleccionarFecha.vueloRedondoPor(cantidadDias)
        );
    }
    @Entonces("debe obtener alguna opcion de vuelo")
    public void viajeObtenerAlgunaOpcion() {
        Ensure.that(HotelesEncontrados.LIST_HOTELES_ENCONTRADOS).isDisplayed();
    }

}
