Feature: Login en aplicativo OrangeHRM
  como usuario deseo realizar el login en la plataforma OrangeHRM

  Scenario: Login exitoso OrangeHRM

    Given que "Ana" se encuentra en OrangeHRM
    When agrega las credenciales usuario "Admin" con clave "admin123"
    Then valido el ingreso exitoso al sistema