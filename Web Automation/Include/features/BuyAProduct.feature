Feature: Buy Product

  Scenario Outline: User want to buy a product
    Given User on login page
    When User fill valid email <email> and password <password>
    And User click button login
    And User in homepage
    And User choose a product
    And User click button Beli
    And User click icon Keranjang
    Then User click button Bayar to buy a product

    Examples: 
      | email          | password   |
      | test@gmail.com |  test      |