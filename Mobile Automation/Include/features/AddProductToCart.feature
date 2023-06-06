@AddProductToCart
Feature: Product

  @add-product-to-cart
  Scenario: As user I want to add product to cart
    Given I on the homepage
    When I tap button Beli
    Then Product added on cart