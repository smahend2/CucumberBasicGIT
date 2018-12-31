@loginWithDataTable
Feature: Login into the application
  Successful login verification and how page should be displayed

  Background:
    Given I navigate to the login page of the application

  Scenario: Login with correct username and password using Data tables
    And I enter the following for the login
      | Usernam | Password      |
      | admin   | adminpassword |
    And I click login button
    Then I should see the userform page