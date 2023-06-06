Feature: Hello
  As an user
  I want to see index
  So that I can see hell0

  Scenario: Get - As user I have be able to get index
    Given I set correct GET endpoints
    When I send HTTP requestes Get
    Then I receives HTTP response codes 200

  Scenario: Get - As user I failed to get index
    Given I set incorrect GET endpoints
    When I send HTTP requested Get
    Then I receives HTTP response codes 404