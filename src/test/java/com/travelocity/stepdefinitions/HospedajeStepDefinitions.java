package com.travelocity.stepdefinitions;

import com.travelocity.tasks.AgregarHospedaje;
import com.travelocity.tasks.SeleccionarDestinoHospedaje;
import com.travelocity.tasks.SeleccionarFecha;
import com.travelocity.userinterfaces.HotelesEncontrados;
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
    public void hospedajePorDiasAgregarAuto(Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarHospedaje.unAuto(),
                SeleccionarFecha.hospedajePor(cantidadDias)
        );
    }

    @Cuando("quiere hospedarse por {int} dias agregando una habitacion")
    public void hospedajePorDiasAgregarHabitacion(Integer diasHospedaje) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarHospedaje.unaHabitacion(),
                SeleccionarFecha.hospedajePor(diasHospedaje)
        );
    }

    @Entonces("debe obtener alguna opcion de hospedaje")
    public void hospedajeObtenerAlgunaOpcion() {
        Ensure.that(HotelesEncontrados.LIST_HOTELES_ENCONTRADOS).value().hasSizeGreaterThan(0);
    }
}
