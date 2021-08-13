# language: es

Característica: Ingresar al portal de empleo choucair
  Como Gerente administrativo
  Necesito Que se muestre una opción de ir al porta de empleo
  Para Para mostrarle las vacantes de empleos disponibles a mis clientes y usuarios finales
  @EscenarioSinEjemplos
  Escenario: Validar que el sistema perimita ingresar al portal de empleo choucairtestin
    Dado que el usuario ingresa a la sesion de empleo choucair
    Cuando el navegue a la pagina de ir al portal de empleo
    Entonces el debe visualizar otra pagina web donde se muestre la informacion de la pagina empleochoucairtesting

  @EscenarioConnEjemplos
  Esquema del escenario: Validar que el sistema perimita ingresar al portal de empleo choucairtestin
    Dado que el usuario ingresa a la sesion de empleo choucair

    Cuando el navegue a la pagina de ir al portal de empleo choucair
      | <ingresarlaurl> | <empleo> |
    Entonces el debe visualizar otra pagina web donde se muestre la informacion de la pagina empleochoucairtest

    Ejemplos:
      | ingresarlaurl | empleo   |
      | choucair      | choucair |

