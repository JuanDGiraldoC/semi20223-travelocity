#language: es
Característica: traslado entre aeropuertos y hoteles
  yo como viajero
  quiero un auto para transladarme entre aeropuertos y hoteles
  para facilitar mis viajes

  @manual
  Escenario: rentar un auto para translado con las opciones por defecto
    Dado Sebastian llega al aeropuerto de "Medellín"
    Cuando necesita un traslado al hotel "Hotel San Fernando Plaza"
    Entonces debe obtener alguna opcion de auto