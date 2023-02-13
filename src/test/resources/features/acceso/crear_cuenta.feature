#language: es
  Característica: crear una cuenta
    yo como viajero
    quiero poder crear una cuenta
    para facilitar la gestion de mis viajes

  Escenario: crear una cuenta gratuita con un correo ya registrado
    Dado Juan quiere guardar y gestionar sus viajes
    Cuando quiere crear una cuenta nueva con nombre "Juan", apellido "Giraldo", e-mail "juandgc09@hotmail.com", password "TestTravelocity2023!"
    Entonces debe obtener un resultado fallido