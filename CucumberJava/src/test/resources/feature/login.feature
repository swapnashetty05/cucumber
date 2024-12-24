#Author: Swapna shetty
@tag
Feature: login functionality test
  I want to use this template for my feature file

  Scenario: Check login with valid credentials
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page

  @smoke
  Scenario: Check login with invalid credentials
    Given user is on login page
    When user enters invalid username and password
    And clicks on login button
    Then error message is displayed - Invalid Credentials

  @smoke
  Scenario Outline: Title of your scenario outline
    Given user is on login page
    When user enters valid <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | name1    | abc      |
      | name2    | def      |
