@register
Feature: Register

  @register-with-valid-credential
  Scenario Outline: User create new account with fill all field
    Given User on the register page
    When User fill valid fullname <fullname> and email <email> and password <password>
    And User click register button
    Then User success register

    Examples: 
      | fullname    | email                    | password   |
      | Test        |     test@gmail.com       | test       |
      | CobaTest    |     coba@gmail.com       | cobatest   |
      
  @register-with-empty-fullname
  Scenario Outline: User create new account with empty fullname
    Given User on the register page
    When User empty fullname <fullname> and email <email> and password <password>
    And User click register button
    Then User see alert fullname is required
    
    Examples: 
      | fullname    | email                    | password   |
      |             |     test@gmail.com       | mobiletest |
      |             |     coba@gmail.com       | cobatest   |
      
  @register-with-empty-email
  Scenario Outline: User create new account with empty email
    Given User on the register page
    When User fill fullname <fullname> and empty email <email> and password <password>
    And User click register button
    Then User will see alert email is required
    
    Examples: 
      | fullname    | email                    | password   |
      |  Test       |                          | test       |
      | CobaTest    |                          | cobatest   |