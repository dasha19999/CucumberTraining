Feature: Open an Employee page
  Background:
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in

    Scenario: open an employee page
      When user clicks on PIM option
      And user clicks on Employee List button
      Then list of all Employees is displayed
      When user enters valid employee id
      And user clicks the search button
      And user clicks the employee
      Then employee's personal page is displayed