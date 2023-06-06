@Authentication
Feature: Authentication
  As an user
  I want to login or register
  So that I can see user information

  Scenario: Post - As user I have be able to register with valid data
    Given I set valid POST endpoint
    When I send POST HTTP Req
    Then I receive correct HTTP response code is 200

  Scenario: Post - As user I failed to register with invalid url
    Given I set invalid POST endpoints
    When I send POST HTTP Reques
    Then I receive correct HTTP response code is 404

  Scenario: Post - As user I failed to register with existing email
    Given I set valid endpoints
    When I send POST HTTP Request body
    Then I receive correct HTTP response code is 400

  Scenario: Post - As user I failed to register with empty email
    Given I set valid url register
    When I send POST HTTP requests body
    Then I receive correct HTTP responses code is 400

  Scenario: Post - As user I failed to register with empty fullname
    Given I set valids url register
    When I send POST HTTP requested body
    Then I receive correct HTTP responses code is 400 Bad Request

  Scenario: Post - As user I failed to register with empty password
    Given I set valids url
    When I send HTTP requested body POST
    Then I receive correct HTTP responses code 400 Bad Request

  Scenario: Post - As user I failed to register with all empty data
    Given I set correct url
    When I send HTTP requests body POST
    Then I receive correct HTTP responses codes 400 Bad Request

  Scenario: Post - As user I have be able to login with valid data
    Given I set valid POST endpoints
    When I send POST HTTP Reqs
    Then I receive the HTTP response code is 200

  Scenario: Post - As user I failed to login with invalid url
    Given I set invalids POST endpoint
    When I sending POST HTTP Reques
    Then I receive the HTTP response code is 404

  Scenario: Post - As user I failed to login with empty email
    Given I set corect POST endpoint
    When I sending POST HTTP Request body
    Then I receive the HTTP response code is 400

  Scenario: Post - As user I failed to login with empty password
    Given I set corects POST endpoint
    When I sending POST HTTP Requests body
    Then I receive the HTTP response code 400

  Scenario: Post - As user I failed to login with empty data
    Given I set corects POST endpoints
    When I sending POST HTTP Requests bodys
    Then I receive the HTTP responses code 400

  Scenario: Post - As user I failed to login with valid email and invalid password
    Given I set corect POST endpoints
    When I sending HTTP Requests body POST
    Then I receive the HTTP responses codes 400

  Scenario: Post - As user I failed to login with invalid email and valid password
    Given I set corect endpoints
    When I sending HTTP Requests bodys POST
    Then I receives the HTTP responses codes 400

  Scenario: Post - As user I failed to login with invalid data
    Given I am set corect endpoints
    When I am sending HTTP Requests bodys POST
    Then I am receives the HTTP responses codes 400

  Scenario: Get - As user I have be able to get user information
    Given I am set valid GET endpoint
    When I am send GET HTTP Request
    Then I am receive correct HTTP response code 200

  Scenario: Get - As user I failed to get user information
    Given I am set invalid GET endpoint
    When I am send GET HTTP Requests
    Then I am receive correct HTTP response code 404