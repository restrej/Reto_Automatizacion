Feature: Buscar un producto y agregar al carrito de compras

  Scenario: Buscar producto Playstation
    Given que Juan quiere usar la busqueda de promart
    When busca el producto Playstation
    Then validar que fue agregado Farpoint al carrito de compras exitosamente