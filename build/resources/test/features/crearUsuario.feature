Feature: Crear usuario en aplicativo OrangeHRM
  Que cuando me encuentro en OrangeHRM pueda crear usuarios

  Scenario: Crear usuario

    Given que me encuentro en OrangeHRM
    When ingreso credenciales usuario "Admin" con clave "admin123"
    When agrega los datos de empleado
      | firstName | lastName | middleName | photograph | nameLogin | passLogin    |
      | Sebastian | Villegas |            | img.png    | Sebas     | sebastian123 |
    Then valido que el empleado se ha creado de forma correcta