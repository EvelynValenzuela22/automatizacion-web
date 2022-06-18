Feature: Crear usuario en aplicativo OrangeHRM
  que cuando me encuentro en OrangeHRM pueda crear usuarios

  Scenario: Crear usuario en OrangeHRM

    Given que "Ana" se encuentra en OrangeHRM
    When agrega las credenciales usuario "Admin" con clave "admin123"
    When agrega los datos de empleado
      | firstName | lastName | middleName | photograph | nameLogin | passLogin |
      | Marcelo   | Gómez    |            | img.png    | marcelo   | marce123  |
    Then valido que el empleado se ha creado de forma correcta