@ViewDetailProduct
Feature: Product

  @view-detail-product
  Scenario: User see detail a product
    Given User on home page
    When User select a product
    And User click detail button
    Then User see detail a product