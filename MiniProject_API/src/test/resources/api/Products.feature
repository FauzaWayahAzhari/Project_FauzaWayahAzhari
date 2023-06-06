@Products
Feature: Products
  As an user
  I want to see list of products
  So that I can create new product

  Scenario: Get - As user I have be able to get detail products
    Given I set GET endpoint
    When I send GET HTTP request
    Then I receive valid HTTP response code 200

  Scenario: Get  - As user I fail to get all products
    Given I set invalid GET endpoint
    When I send GET HTTP requests
    Then I receive valid HTTP response code 404

  Scenario: Post- As user I have be able to create a new product with valid data
    Given I set POST endpoint
    When I send POST HTTP request
    Then I receive the valid HTTP response code 200

  Scenario: Post - As user I failed to create a new product with invalid url
    Given I set invalid POST endpoint
    When I send POST HTTP requests
    Then I receive the valid HTTP response code 404

  Scenario: Post - As user I failed to create new product with string price
    Given I set valid endpoint
    When I send HTTP requested
    Then I receive the valid HTTP response code 400

  Scenario: Post - As user I failed to create new product with empty name
    Given I set valid url
    When I send HTTP request body
    Then I receive the valid HTTP responses codes 400

  Scenario: Get - As user I have be able to get product by id
    Given I set valids GET endpoints
    When I send HTTP request
    Then I receive the valid HTTP responses code 200

  Scenario: Get - As user I failed to get product by id
    Given I set invaliid GET endpoints
    When I send HTTP requests
    Then I receive the valid HTTP responses code 404

  Scenario: Delete - As user I have be able to delete a product
    Given I set Delete endpoint
    When I send Delete HTTP request
    Then I receive HTTP responses code 200

  Scenario: Delete - As user I fail to delete a product
    Given I set invalid Delete endpoint
    When I send Delete HTTP requests
    Then I receive HTTP responses code 404

  Scenario: Post- As user I have be able to assign a product rating
    Given I am set POST endpoint
    When I am send POST HTTP request
    Then I am receive the valid HTTP response code 200

  Scenario: Post- As user I failed to assign a product rating
    Given I am set invalid POST endpoint
    When I am send POST HTTP requests
    Then I am receive the valid HTTP response code 404

  Scenario: Get - As user I have be able to get product ratings
    Given I set valid GET endpoint
    When I send GET HTTP requestt
    Then I receive HTTP response code 200

  Scenario: Get - As user I failed to get product ratings
    Given I set invalids GET endpoint
    When I send GET HTTP requestts
    Then I receive HTTP response code 404

  Scenario: Post- As user I have be able to create a comment
    Given I am set valid POST endpoint
    When I am sending POST HTTP request
    Then I am receive the valid HTTP response code is 200

  Scenario: Post- As user I failed to create a comment
    Given I am set invalid POST endpoints
    When I am sending POST HTTP requests
    Then I am receive the valid HTTP response code is 404

  Scenario: Get - As user I have be able to get product comment
    Given I set valids GET endpoint
    When I send GET HTTP requestted
    Then I receive HTTP response codes 200

  Scenario: Get - As user I failed to get product comment
    Given I set invalids GET endpoints
    When I send GET HTTP requestss
    Then I receive HTTP response codes 404

  Scenario: Get - As user I have be able to get product by id
    Given I set corrects GET endpoints
    When I send GET HTTP req
    Then I receive HTTP res codes 404