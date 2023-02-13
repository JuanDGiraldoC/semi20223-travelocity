# language: es
Característica: hospedaje
  yo como viajero
  quiero hospedarme en una ciudad
  para facilitar mis viajes

  Escenario: hospedaje agregando un auto
    Dado Camilo se encuentra en "Miami"
    Cuando quiere hospedarse por 4 dias agregando un auto
    Entonces debe obtener alguna opcion de hospedaje

  Escenario: hospedaje agregando una habitacion
    Dado Laura se encuentra en "Cali"
    Cuando quiere hospedarse por 4 dias agregando una habitacion
    Entonces debe obtener alguna opcion de hospedaje