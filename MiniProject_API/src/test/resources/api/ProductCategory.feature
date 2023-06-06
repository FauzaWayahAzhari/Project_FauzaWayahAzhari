@ProductCategory
Feature: Product Category
  As an user
  I want to see list of product category
  So that I can create new product category

  Scenario: Post - As user I have be able to create a new product category with valid data
    Given I set correct POST endpoint
    When I send HTTP request POST
    Then I receives the HTTP response code 200

  Scenario: Post - As user I failed to create a new product category with invalid url
    Given I set incorrect POST endpoint
    When I send HTTP requests POST
    Then I receives the HTTP response code 404 Not Found

  Scenario: Post - As user I failed to create a new product category with invalid type data name
    Given I set correct endpoint
    When I send HTTP requests body
    Then I receives the HTTP response code 500

  Scenario: Get - As user I have be able to get category by id
    Given I set corrects GET endpoiint
    When I sending HTTP requests Get
    Then I receives HTTP response code 200 OK

  Scenario: Get - As user I failed to get category by id
    Given I set incorrects GET endpoint
    When I send HTTP req Get
    Then I receives HTTP ResCode 404

  Scenario: Get - As user I have be able to get all category
    Given I set correct GET endpoint
    When I send HTTP request Get
    Then I receives HTTP response code 200

  Scenario: Get - As user I failed to get all category
    Given I set incorrect GET endpoint
    When I send HTTP requests Get
    Then I receives HTTP response code 404

  Scenario: Delete - As user I have be able to delete a category
    Given I set Delete endpointss
    When I send HTTP request Delete
    Then I receive valid HTTP responses code 200

  Scenario: Delete - As user I fail to delete a category
    Given I set invalid Delete endpoints
    When I send HTTP requests Delete
    Then I receive HTTP responses codes 404
