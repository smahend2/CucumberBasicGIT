Feature: Login into the application
  Successful login verification and how page should be displayed

  Scenario: Login with correct username and password
    Given I navigate to the login page of the application
    And I enter the "username" and "password" as admin
    And I click login button
    Then I should see the userform page

 # https://guides.github.com/activities/hello-world/