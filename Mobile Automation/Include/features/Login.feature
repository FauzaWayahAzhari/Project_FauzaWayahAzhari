@login
Feature: Login

  @login-valid-data
  Scenario: As user I want to success login
    Given I am on login page
    When I fill valid email
    And I fill valid password
    And I tap login button
    Then I am on homepage
    
  @login-invalid-email
  Scenario: As user I failed login with invalid email
    Given I am on login page
    When I fill invalid email
    And I fill valid password
    And I tap login button
    Then I see alert email atau password tidak valid
    
  @login-invalid-password
  Scenario: As user I failed login with invalid password
    Given I am on login page
    When I fill valid email
    And I fill invalid password
    And I tap login button
    Then I see alert email atau password tidak valid
    
  @login-invalid-data
  Scenario: As user I failed login with invalid data
    Given I am on login page
    When I fill invalid email
    And I fill invalid password
    And I tap login button
    Then I see alert email atau password tidak valid
    
  @login-empty-email
  Scenario: As user I failed login with empty email
    Given I am on login page
    When I fill empty email
    And I fill invalid password
    And I tap login button
    Then I see alert email can not empty
    
  @login-empty-password
  Scenario: As user I failed login with empty password
    Given I am on login page
    When I fill valid email
    And I fill empty password
    And I tap login button
    Then I see alert password can not empty