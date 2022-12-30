Feature: Terminating an Employee

  Background:
    When user enters valid admin username and valid admin password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on Employee List button
    When user enters valid employee id
    And user clicks the search button
    And user clicks the employee
    Then employee's personal page is displayed

  @test11
  Scenario: Terminating Employee
    When user clicks on Job
    And user clicks on Terminate Employment
    And user clicks on Confirm
    Then specified employee is terminated