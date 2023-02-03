# language: es
Característica: Vuelos redondos
  yo como viajero
  quiero diseñar vuelos de ida y regreso
  para facilitar mis viajes

  Escenario: Vuelo redondo con opciones por defecto
    Dado Yoimar esta en "Medellin"
    Cuando quiera viajar a "Cancun" por 15 dias
    Entonces debe obtener alguna opcion de vuelo

  Escenario: Vuelo redondo en clase economica premium
    Dado Diego esta en "Medellin"
    Cuando quiera viajar a Cancun en clase economica premium por 15 dias
    Entonces debe obtener alguna opcion de vuelo

  @manual
  Escenario: Vuelo redondo con opcion de agregar auto
    Dado Laura esta en "Medellin"
    Cuando quiera viajar a "Cancun" agregando un auto
    Entonces debe obtener al menos una opcion de auto

  @manual
  Escenario: Vuelo redondo con opcion de agregar hospedaje
    Dado Juan esta en "Medellin"
    Cuando quiera viajar a "Cancun" agregando un hospedaje por 8 dias
    Entonces debe obtener alguna opcion de vuelo
    Y debe obtener alguna opcion de hospedaje