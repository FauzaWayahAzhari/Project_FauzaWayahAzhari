@Orders
Feature: Orders
  As an user
  I want to see orders data
  So that I can create new order

  Scenario: Post - As user I have be able to create a new order
    Given I am set valid POST endpoints
    When I am send HTTP requests POST
    Then I am receive valid HTTP response code is 200

  Scenario: Post - As user I failed to create a new order
    Given I am set incorrect POST endpoints
    When I am send HTTP request POST
    Then I am receive valid HTTP response code is 404

  Scenario: Get - As user I have be able to get all orders
    Given I am set valid Get endpoints
    When I am send HTTP requests Get
    Then I am receive HTTP response code is 200

  Scenario: Get - As user I failed to get all orders
    Given I am set invalid Get endpoints
    When I am sending HTTP requests Get
    Then I am receive HTTP response code is 404

  Scenario: Get - As user I have be able to get order by id
    Given I am set correct Get endpoints
    When I am send HTTP request Get
    Then I am receive HTTP responses code is 200

  Scenario: Get - As user I failed to get order by id
    Given I am set incorrect Get endpoints
    When I am sending HTTP request Get
    Then I am receive HTTP responses code is 404
