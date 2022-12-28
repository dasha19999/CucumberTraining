Feature: Add Employee Job Details functionality

  Background:
    When user enters valid admin username and valid admin password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on Employee List button
    When user enters valid employee id
    And user clicks the search button
    When user clicks the employee
    Then employee's personal page is displayed
    When  user clicks Job button
    Then Job tab is present
    When user clicks edit button

  @test10
  Scenario: adding job details to an existing employee profile

    Then Job Title dropdown field is displayed and user can select values from there
    And Employment Status dropdown field is displayed and user can select values from there
    And Job Category dropdown field is displayed and user can select values from there
    And Joined Date calendar is displayed and user can pick values from there
    And Sub Unit dropdown field is displayed and user can select values from there
    And Location dropdown field is displayed and user can select values from there
    And Start Date calendar is displayed and user can pick values from there
    And End Date calendar is displayed and user can pick values from there
    And Contract Details file upload field is displayed and accepts file up to 1MB









