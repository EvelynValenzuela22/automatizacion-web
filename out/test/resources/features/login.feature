Feature: Login en aplicativo OrangeHRM
  como usuario deseo realizar el login en la plataforma OrangeHRM
  Scenario: Login exitoso OrangeHRM

    Given que me encuentro en OrangeHRM
    When ingreso credenciales usuario <usuario> con clave <clave>
    Then valido el ingreso exitoso al sistema