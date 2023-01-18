Feature: Languages

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
    When user clicks on Qualifications button
    And on Languages section user clicks on Add button

    @test17
    Scenario: Adding languages to any employee

      When user selects "English" on Languages dropdown
      And user selects "Speaking" on Fluency dropdown
      And user selects "Good" on Competency dropdown
      And on Comments text box user enters "My English is great"
      And user clicks on Save button
      Then the language is saved successfully
      Then user can delete language "English" from employee for retesting

