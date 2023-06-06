@register
Feature: Register

  @register-valid-data
  Scenario: As user I want to success register
    Given I am on register page
    When I am fill valid fullname
    And I am fill valid email
    And I am fill valid password
    And I tap register button
    Then I am on the homepage
    
  @register-existing-email
  Scenario: As user I failed tegister with existing email
    Given I am on register page
    When I am fill valid fullname
    And I am fill existing email
    And I am fill valid password
    And I tap register button
    Then I see alert gagal
    
  @register-empty-fullname
  Scenario: As user I failed tegister with empty fullname
    Given I am on register page
    When I am fill empty fullname
    And I am fill valid email
    And I am fill valid password
    And I tap register button
    Then I see warning fullname can not empty
    
  @register-empty-email
  Scenario: As user I failed tegister with empty email
    Given I am on register page
    When I am fill valid fullname
    And I am fill empty email
    And I am fill valid password
    And I tap register button
    Then I see warning fullname can not empty