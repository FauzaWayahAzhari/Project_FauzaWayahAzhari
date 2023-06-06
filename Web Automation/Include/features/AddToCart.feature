@BuyProduct
Feature: Transaction

  @buy-a-product
  Scenario: User want to buy a product - without login
    Given User in the home page
    When User select product
    And User click Beli button
    Then Product on cart