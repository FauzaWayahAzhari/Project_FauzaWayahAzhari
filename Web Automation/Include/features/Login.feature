@login
Feature: Login

  @login-with-valid-credential
  Scenario Outline: User login using existing account
    Given User on the login page
    When User fill email <email> and password <password>
    And User click login button
    Then User success login

    Examples: 
      | email          | password   |
      | test@gmail.com |  test      |
      | coba@gmail.com |  cobatest  |
      
  @login-with-empty-email-field
  Scenario Outline: User login with empty email field
    Given User on the login page
    When User fill empty email <email> and password <password>
    And User click login button
    Then User see warning alert email is required

    Examples: 
      | email          | password   |
      |                |  test      |
      |                |  cobatest  |
      
  @login-with-invalid-email
  Scenario Outline: User login using invalid email
    Given User on the login page
    When User fill invalid email <email> and password <password>
    And User click login button
    Then User see warning alert record not found

    Examples: 
      | email             | password   |
      | test123@gmail.com |    test    |
      | coba123@gmail.com |  cobatest  |
      
  @login-with-invalid-password
  Scenario Outline: User login using invalid password
    Given User on the login page
    When User fill email <email> and invalid password <password>
    And User click login button
    Then User see warning alert email or password is invalid

    Examples: 
      | email             | password     |
      | test@gmail.com    |    test123   |
      | coba@gmail.com    |  cobatest123 |
      
  @login-with-invalid-data
  Scenario Outline: User login using invalid data
    Given User on the login page
    When User fill invalid email <email> and invalid password <password>
    And User click login button
    Then User see warning alert record not found

    Examples: 
      | email                | password     |
      | test123@gmail.com    |    test123   |
      | coba123@gmail.com    |  cobatest123 |