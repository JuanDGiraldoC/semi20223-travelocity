# language: es
Característica: Vuelos entre varios destinos
  yo como viajero
  quiero diseñar vuelos entre varios destinos
  para facilitar mis viajes

  @manual
  Escenario: Viaje hacia tres destinos con opciones por defecto
    Dado Bryan esta en "Medellín"
    Cuando quiera viajar a "Cancún" por 6 dias, luego a "Barcelona" por 3 dias, luego a "Berlín" por 10 días
    Entonces debe obtener alguna opcion de vuelo por cada destino