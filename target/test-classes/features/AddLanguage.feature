Feature: Languages

  Background:
    Given user is navigated to HRMS application
    When user enters valid admin username and valid admin password
    And user clicks on login button
    Then user is successfully logged in

    @test17
    Scenario: Adding languages to any employee
      Given user is successfully logged in
      And user clicks on PIM tab
      And user clicks on Employee List dropdown
      And user enters 43541A in Employee id text field
      And user clicks search
      And user clicks on Employee Name Annali Rosalie Solano
      And user clicks on Qualifications button
      And on Languages section click on Add button
      And user selects English on Languages dropdown
      And user selects Specking on Fluency dropdown
      And user selects Good on Competency dropdown
      And on Comments text box user enters desired text
      Then user clicks on Save button

