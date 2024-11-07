Feature: Pruebas Puntos Colombia

  @CPLA001
  Scenario Outline: CPLA001 Login User Locked
    Given Ingresar al portal
    When Realizar login <user> <password>
    Then Valido user locked

    Examples:
      | user              | password       |
      | "locked_out_user" | "secret_sauce" |

  @CPLA002
  Scenario Outline: CPLA002 Compra Exitosa
    Given Ingresar al portal
    When Realizar login <user> <password>
    And Comprar articulo <articulo> <firstName> <lastName> <zip>
    Then Valido compra de articulo

    Examples:
      | user              | password       | articulo | firstName | lastName  | zip      |
      | "standard_user" | "secret_sauce" | "Bike"   | "Felipe"  | "Orjuela" | "110111" |